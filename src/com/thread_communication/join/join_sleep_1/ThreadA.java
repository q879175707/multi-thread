package com.thread_communication.join.join_sleep_1;

public class ThreadA extends Thread{
	private ThreadB b;
	
	public ThreadA(ThreadB b) {
		this.b = b;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			synchronized (b) {
				b.start();
				Thread.sleep(6000);
				// Thread.sleep()≤ª Õ∑≈À¯
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
