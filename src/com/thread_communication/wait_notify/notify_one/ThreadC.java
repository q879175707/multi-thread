package com.thread_communication.wait_notify.notify_one;

public class ThreadC extends Thread {
	private Object lock;
	
	public ThreadC(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.testMethod(lock);
	}
}
