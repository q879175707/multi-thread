package com.thread_communication.wait_notify.wait_release_lock;

public class ThreadB extends Thread{
	
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