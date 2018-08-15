package com.t9;

public class ThreadB extends Thread{
	private MyOneList list;
	public ThreadB(MyOneList list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		super.run();
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "B");
	}
}
