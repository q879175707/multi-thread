package com.volatile_test.atomic_interger_no_safe;

public class MyThread extends Thread{
	private MyService service;
	public MyThread(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.addNum();
	}
}
