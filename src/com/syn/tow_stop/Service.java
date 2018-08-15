package com.syn.tow_stop;

public class Service {
	synchronized public void methodA() {
		System.out.println("methodA begin");
		boolean a = true;
		while(true){
			
		}
	}
	
	synchronized public void methodB() {
		System.out.println("methodB begin");
		System.out.println("methodB end");
		
	}
}
