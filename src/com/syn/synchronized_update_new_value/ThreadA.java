package com.syn.synchronized_update_new_value;

public class ThreadA extends Thread{
	
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.runMethod();
	}
}
