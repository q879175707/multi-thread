package com.thread_communication.wait_notify.wait_interrupted_exception;

/**
 * ���̳߳�wait()״̬�������̶߳����interrupt()���������InterruptedExcetpion�쳣��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
