package com.thread_communication.join.join_exception;

public class ThreadA extends Thread{
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String newString = new String();
			Math.random();
		}
	}
}
