package com.etc.thread_group2;

/**
 * �Զ���ThreadGroup�߳��飬��дUncaughtException�������������߳��ж���Ϊ
 * ÿ�������run�����ڲ�Ҫ���쳣catch��䣬�����catch��䣬����д���쳣��������ִ�С�
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("�ҵ��߳���");
		MyThread[] myThread = new MyThread[10];
		
		for (int i = 0; i < 10; i++) {
			myThread[i] = new MyThread(group, "�߳�" + (i + 1), "1");
			myThread[i].start();
		}
		
		MyThread newT = new MyThread(group, "�����߳�", "a");
		newT.start();
	}
}
