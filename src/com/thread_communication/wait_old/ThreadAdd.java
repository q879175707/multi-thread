package com.thread_communication.wait_old;

public class ThreadAdd extends Thread{

	private Add p;
	public ThreadAdd(Add p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		super.run();
		p.add();
	}
}
