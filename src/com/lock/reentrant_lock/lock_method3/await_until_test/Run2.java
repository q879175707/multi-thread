package com.lock.reentrant_lock.lock_method3.await_until_test;

/**
 * 线程在等待时间到达前，可以被其他线程提前唤醒。
 * @author Administrator
 *
 */
public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.start();
		
		Thread.sleep(2000);
		
		ThreadB b = new ThreadB(service);
		b.start();
	}
}
