package com.thread_communication.wait_notify.p_c_all_wait;

public class ThreadP extends Thread {
	private P p;

	public ThreadP(P p) {
		this.p = p;
	}

	@Override
	public void run() {
		while(true){
			p.setValue();
		}
	}
}
