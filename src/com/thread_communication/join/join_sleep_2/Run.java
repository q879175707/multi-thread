package com.thread_communication.join.join_sleep_2;

/**
 * �����߳�ThreadA �ͷ���ThreadB�����������߳�ThreadC���Ե���ThreadB�е�
 * ͬ������ synchronized public void BService();
 * 
 * ˵��join��long�� �����ͷ������ص㡣
 * 
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			
			Thread.sleep(1000);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
