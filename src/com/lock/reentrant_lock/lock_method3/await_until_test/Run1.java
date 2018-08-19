package com.lock.reentrant_lock.lock_method3.await_until_test;

/**
 * 10秒后自动唤醒自己
 * @author Administrator
 *
 */
public class Run1 {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
