package com.lock.reentrant_lock.use_condition_wait_notify_error;

public class ThreadA extends Thread{
	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.await();
	}
}
