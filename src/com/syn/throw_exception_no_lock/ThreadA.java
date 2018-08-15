package com.syn.throw_exception_no_lock;

public class ThreadA extends Thread{
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
