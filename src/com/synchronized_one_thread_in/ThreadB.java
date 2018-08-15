package com.synchronized_one_thread_in;

public class ThreadB extends Thread{
	private ObjectService service;
	
	public ThreadB(ObjectService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
