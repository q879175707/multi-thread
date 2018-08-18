package com.thread_communication.join.join_long;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("begin time=" + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
