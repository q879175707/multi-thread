package com.etc.state_test4;

/**
 * ִ��wait�������̵߳�״̬ö��ֵ����WAITING
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main ������t��״̬��" + t.getState());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
