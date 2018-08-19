package com.lock.reentrant_lock.condition_test_more_method;

public class ThreadA extends Thread{

	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
