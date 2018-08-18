package com.thread_communication.join.join_exception;

public class ThreadC extends Thread{
	
	private ThreadB threadB;
	
	public ThreadC(ThreadB threadB) {
		this.threadB = threadB;
	}
	@Override
	public void run() {
		super.run();
		
		threadB.interrupt();
	}
}
