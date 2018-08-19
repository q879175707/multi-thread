package com.lock.reentrant_lock.lock_method.lock_method_test1;

/**
 * 方法int getHoldCount()的作用
 * 查询当前线程保持此锁的个数，也就是调用lock()方法的次数。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		service.serviceMethod1();
	}
}
