package com.syn.has_self_private_num;

public class ThreadB extends Thread {
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}
}
