package com.syn.has_self_private_num;

public class ThreadA extends Thread{

	private HasSelfPrivateNum numRef;
	
	public ThreadA(HasSelfPrivateNum numRef) {
		this.numRef = numRef;
	}
	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
