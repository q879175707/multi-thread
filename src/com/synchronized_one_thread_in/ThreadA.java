package com.synchronized_one_thread_in;

public class ThreadA extends Thread{
	private ObjectService service;
	
	public ThreadA(ObjectService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.serviceMethod();
	}
}
