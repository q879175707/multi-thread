package com.syn_static_method;

public class ThreadB extends Thread {
	@Override
	public void run() {
		super.run();
		Service.printB();
	}
}
