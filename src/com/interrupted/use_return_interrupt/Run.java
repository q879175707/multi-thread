package com.interrupted.use_return_interrupt;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
	}
}
