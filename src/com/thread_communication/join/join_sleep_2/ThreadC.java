package com.thread_communication.join.join_sleep_2;

public class ThreadC extends Thread{

	private ThreadB b;
	
	public ThreadC(ThreadB b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		b.bService();
	}
}
