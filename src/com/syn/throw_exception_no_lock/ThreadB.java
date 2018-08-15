package com.syn.throw_exception_no_lock;

public class ThreadB extends Thread{
	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.testMethod();
	}
}
