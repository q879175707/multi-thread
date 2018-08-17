package com.thread_communication.p_c_all_wait;

public class ThreadC extends Thread {
	private C c;

	public ThreadC(C c) {
		this.c = c;
	}

	@Override
	public void run() {
		while(true){
			c.getValue();
		}
	}
}
