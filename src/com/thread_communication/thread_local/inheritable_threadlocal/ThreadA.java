package com.thread_communication.thread_local.inheritable_threadlocal;

public class ThreadA extends Thread{
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
