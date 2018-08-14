package com.suspend_resume_lockstop;

public class MyThread extends Thread{

	private long i = 0;
	@Override
	public void run() {
		super.run();
		while (true) {
			i++;
			System.out.println(i);
		}
	}
}
