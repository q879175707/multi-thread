package com.thread_communication.wait_notify.test2;

public class MyThread2 extends Thread {

	private Object lock;

	public MyThread2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		super.run();
		synchronized (lock) {
			System.out.println("��ʼ	notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("����	notify time=" + System.currentTimeMillis());
		}
	}
}
