package com.thread_communication.thread_local.threadlocal_test;

/**
 * 虽然三个线程都向t1对象中set数据，但每个线程还是能取出自己的数据
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();
			a.start();
			b.start();
			
			for(int i = 0; i < 100; i++) {
				Tools.t1.set("Main" + (i + 1));
				System.out.println("Main get value="
						+ Tools.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
