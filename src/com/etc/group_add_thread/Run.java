package com.etc.group_add_thread;

/**
 * �߳������������̣߳����������߳�һֱ���޵Ĳ��Ҽ��3���ӡ��־��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadGroup group = new ThreadGroup("���������߳���");
		Thread aThread = new Thread(group, a);
		Thread bThread = new Thread(group, b);
		aThread.start();
		bThread.start();
		System.out.println("����߳���Ϊ��"+group.activeCount());
		System.out.println("����߳�������Ϊ��"+group.getName());
	}
}
