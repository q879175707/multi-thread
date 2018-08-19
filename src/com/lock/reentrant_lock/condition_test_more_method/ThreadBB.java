package com.lock.reentrant_lock.condition_test_more_method;

public class ThreadBB extends Thread{

	private MyService service;
	
	public ThreadBB(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
