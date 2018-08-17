package com.thread_communication.wait_notify.notify_one;

public class ThreadB extends Thread {
	private Object lock;
	
	public ThreadB(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.testMethod(lock);
	}
}
