package com.thread_communication.join.join_exception;

public class ThreadB extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			System.out.println("线程B在Run end处打印了");
		} catch (Exception e) {
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
}
