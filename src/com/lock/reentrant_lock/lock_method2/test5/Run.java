package com.lock.reentrant_lock.lock_method2.test5;

/**
 * boolean isLocked()的作用：
 * 查询此锁定是否由任意线程保持
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		final Service service1 = new Service(true);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				service1.serviceMethod();
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
