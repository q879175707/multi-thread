package com.thread_communication.p_c_stack_1;

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
