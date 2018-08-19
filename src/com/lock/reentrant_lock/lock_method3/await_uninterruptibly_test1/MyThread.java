package com.lock.reentrant_lock.lock_method3.await_uninterruptibly_test1;

public class MyThread extends Thread {
	private Service service;
	
	public MyThread(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
