package com.lock.reentrant_lock.condition_test_more_method;

public class ThreadB extends Thread{

	private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
