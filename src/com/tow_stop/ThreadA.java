package com.tow_stop;

public class ThreadA extends Thread{
	private Service service;
	private ServiceFix fix;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	public ThreadA(ServiceFix fix) {
		this.fix = fix;
	}
	@Override
	public void run() {
		super.run();
		//service.methodA();
		fix.methodA();
	}
}
