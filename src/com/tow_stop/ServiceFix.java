package com.tow_stop;

public class ServiceFix {
	Object object1 = new Object();
	public void methodA() {
		synchronized(object1) {
			System.out.println("methodA begin");
			boolean a = true;
			while(true){
				
			}
		}
	}
	
	Object object2 = new Object();
	public void methodB() {
		synchronized (object2) {
			System.out.println("methodB begin");
			System.out.println("methodB end");
		}
	}
}
