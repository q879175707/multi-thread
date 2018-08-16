package com.thread_communication.test2;

public class MyThread1 extends Thread{
	
	private Object lock;
	public MyThread1(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				System.out.println("¿ªÊ¼  		wait time=" + System.currentTimeMillis());
				lock.wait();
				System.out.println("½áÊø		wati time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
