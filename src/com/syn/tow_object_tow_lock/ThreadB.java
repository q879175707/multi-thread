package com.syn.tow_object_tow_lock;

public class ThreadB extends Thread{
	
	private HasSelfPrivateNum numRef;
	
	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("b");;
	}
}
