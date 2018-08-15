package com.syn_block_string2;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB(Service service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.b();
	}
}
