package com.etc.state_test4;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
