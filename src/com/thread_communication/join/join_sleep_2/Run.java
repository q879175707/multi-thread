package com.thread_communication.join.join_sleep_2;

/**
 * 由于线程ThreadA 释放了ThreadB的锁，所以线程ThreadC可以调用ThreadB中的
 * 同步方法 synchronized public void BService();
 * 
 * 说明join（long） 具有释放锁的特点。
 * 
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			
			Thread.sleep(1000);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
