package com.lock.reentrant_lock.lock_method2.test2;

/**
 * 方法boolean hasWaiters(Condition condition)的作用
 * 查询是否有线程正在等待与此锁有关的condition条件
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		
		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
		
		Thread.sleep(2000);
		service.notifyMethod();
	}
}
