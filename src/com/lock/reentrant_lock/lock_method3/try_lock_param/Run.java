package com.lock.reentrant_lock.lock_method3.try_lock_param;

/**
 * boolean tryLock(long timeout,TimeUnit unit)的作用是
 * 如果锁在给定等待时间内没有被另一个线程保持，
 * 并且当前线程未被中断，获取该锁
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
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
