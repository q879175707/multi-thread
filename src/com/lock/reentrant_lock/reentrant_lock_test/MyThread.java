package com.lock.reentrant_lock.reentrant_lock_test;

public class MyThread extends Thread{
	private MyService service;
	
	public MyThread(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.method();
	}
}
