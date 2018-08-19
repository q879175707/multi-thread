package com.lock.reentrant_lock.lock_method2.test4;

/**
 * boolean isHeldByCurrentThread()的作用：
 * 查询当前线程是否保持此锁定。
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
