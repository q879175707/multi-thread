package com.lock.reentrant_lock.use_more_condition_ok;

public class ThreadA extends Thread{

	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.awaitA();
	}
	
}
