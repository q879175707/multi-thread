package com.thread_communication.stack_2_new;

public class P_Thread extends Thread{
	private P p;
	
	public P_Thread(P p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			p.pushService();
		}
	}
}
