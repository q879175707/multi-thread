package com.volatile_test.thread;

public class MyThread extends Thread {
	
	volatile public static int count;

	/**
	 * static 锁的是对象，这样多个线程实例的锁都是MyThread的class锁对象
	 * 可以实现线程的同步。
	 */
	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count = " + count);
	}
	
	@Override
	public void run() {
		super.run();
		addCount();
	}
}
