package com.lock.reentrant_lock.lock_method3.await_until_test;

public class ThreadB extends Thread {
	
	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.notifyMethod();
	}
}
