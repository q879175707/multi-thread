package com.thread_communication.wait_notify.wait_notify_size5;

/**
 * wait end����������˵��notify()ִ�к󲢲������ͷ�����
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(50);
			ThreadB b = new ThreadB(lock);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
