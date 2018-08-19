package com.lock.reentrant_lock.lock_method.lock_method_test3;

/**
 * 方法 int getWaitQueueLength(Condition condition)的作用
 * 是返回等待与此锁定相关的给定条件Condition的线程估计数
 * 比如有5个线程，每个线程都执行了同一个condition对象的await（）方法
 * 则调用getWaitQueueLength(Condition condition)方法返回的int
 * 值是5.
 * @author Administrator
 */
public class Run {
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
