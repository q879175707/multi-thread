package com.thread_communication.stack_3;

public class C_Thread extends Thread{
	private C c;
	
	public C_Thread(C c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			c.popService();
		}
	}
}
