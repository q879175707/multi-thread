package com.syn.syn_static_method;

public class ThreadA extends Thread {
	@Override
	public void run() {
		super.run();
		Service.printA();
	}
}
