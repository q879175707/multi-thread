package com.lock.reentrant_lock.lock_method2.test3;

/**
 * boolean isFair()的作用：
 * 判断是不是公平锁，默认是非公平锁
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
		
		
		final Service service2 = new Service(false);
		runnable = new Runnable() {
			
			@Override
			public void run() {
				service2.serviceMethod();
			}
		};
		
		thread = new Thread(runnable);
		thread.start();
	}
}
