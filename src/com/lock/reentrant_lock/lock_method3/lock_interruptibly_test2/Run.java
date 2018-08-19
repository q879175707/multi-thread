package com.lock.reentrant_lock.lock_method3.lock_interruptibly_test2;

/**
 * void lockInterruptibly()的作用
 * 如果当前线程未被中断，则获取锁，
 * 如果已经被中断则出现异常
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
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
		
		Thread.sleep(500);
		
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
		threadB.interrupt();
		
		System.out.println("main end!");
	}
}
