package com.syn_not_extends;

public class MyThreadB extends Thread{
	
	private Sub sub;
	
	public MyThreadB(Sub sub) {
		this.sub = sub;
	}
	
	@Override
	public void run() {
		super.run();
		sub.serviceMethod();
	}
}
