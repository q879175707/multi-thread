package com.lock.reentrant_lock.fair_no_fair_test;

/**
 * 打印的结果基本上是乱序的，这说明先start()启动的线程不代表先获得锁。
 * @author Administrator
 *
 */
public class RunNotFair {
	public static void main(String[] args) {
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("★线程 " + Thread.currentThread().getName() + "运行了");
				service.serviceMethod();
			}
		};
		Thread[] thread = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}
	}
}
