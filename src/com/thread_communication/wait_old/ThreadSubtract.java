package com.thread_communication.wait_old;

public class ThreadSubtract extends Thread{

	private Subtract p;
	public ThreadSubtract(Subtract p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		super.run();
		p.subtract();
	}
}
