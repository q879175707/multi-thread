package com.etc.thread_group1;

/**
 * ��Ĭ�ϵ�����£��߳����е�һ���̳߳����쳣����Ӱ�쵽�����̵߳����С�
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup group = new ThreadGroup("�ҵ��߳���");
		MyThread newT = new MyThread(group, "�����߳�", "a");
		newT.start();
		Thread.sleep(100);
		MyThread[] myThread = new MyThread[10];
		for (int i = 0; i < 10; i++) {
			myThread[i] = new MyThread(group, "�߳�" + (i + 1), "1");
			myThread[i].start();
		}
		
	}
}
