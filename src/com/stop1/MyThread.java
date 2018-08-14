package com.stop1;

public class MyThread extends Thread {
	private int i = 0;
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("into catch() method");
			e.printStackTrace();
		}
	}
}
