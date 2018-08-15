package com.syn.syn_more_object_static_one_lock;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.printB();
	}
}
