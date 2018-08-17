package com.thread_communication.wait_notify.notify_one;

public class ThreadA extends Thread {
	private Object lock;
	
	public ThreadA(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.testMethod(lock);
	}
}
