package com.syn.t9;

public class ThreadA extends Thread{
	private MyOneList list;
	public ThreadA(MyOneList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}
}
