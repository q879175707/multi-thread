package com.etc.state_test2;

/**
 * ִ��sleep�������̵߳�״̬ö��ֵ����TIMED_WAITING
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main �����е�״̬��" + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
