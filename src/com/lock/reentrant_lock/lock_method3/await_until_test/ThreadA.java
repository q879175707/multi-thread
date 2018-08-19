package com.lock.reentrant_lock.lock_method3.await_until_test;

public class ThreadA extends Thread {
	
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.waitMethod();
	}
}
