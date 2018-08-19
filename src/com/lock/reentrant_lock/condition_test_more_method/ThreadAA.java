package com.lock.reentrant_lock.condition_test_more_method;

public class ThreadAA extends Thread{

	private MyService service;
	
	public ThreadAA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
