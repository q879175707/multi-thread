package com.lock.reentrant_lock.lock_method3.try_lock_test;

/**
 * boolean tryLock()的作用是
 * 仅在调用时，锁未被另一个线程保持的情况下，才获取该锁定。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}
}
