package com.lock.reentrant_lock.lock_method3.await_until_test;

/**
 * 10����Զ������Լ�
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
