package com.dirty_read;

public class ThreadA extends Thread {
	private PublicVar publicVar;

	public ThreadA(PublicVar publicVar) {
		this.publicVar = publicVar;
	}
	
	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
