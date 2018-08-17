package com.thread_communication.wait_notify.stack_2_new;

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
