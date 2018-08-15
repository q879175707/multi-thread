package com.syn_lock_in_2;

public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
