package com.syn.syn_block_string;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("a", "aa");
	}
}
