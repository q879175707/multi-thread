package com.thread_communication.test2;

public class MyThread2 extends Thread {

	private Object lock;

	public MyThread2(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		super.run();
		synchronized (lock) {
			System.out.println("¿ªÊ¼	notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("½áÊø	notify time=" + System.currentTimeMillis());
		}
	}
}
