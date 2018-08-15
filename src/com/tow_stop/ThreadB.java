package com.tow_stop;

public class ThreadB extends Thread{
	private Service service;
	private ServiceFix fix;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	public ThreadB(ServiceFix fix) {
		this.fix = fix;
	}
	
	@Override
	public void run() {
		super.run();
		// service.methodB();
		fix.methodB();
	}
}
