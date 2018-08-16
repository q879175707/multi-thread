package com.volatile_test.thread;

public class MyThread extends Thread {
	
	volatile public static int count;

	/**
	 * static �����Ƕ�����������߳�ʵ����������MyThread��class������
	 * ����ʵ���̵߳�ͬ����
	 */
	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count = " + count);
	}
	
	@Override
	public void run() {
		super.run();
		addCount();
	}
}
