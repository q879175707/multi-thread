package com.lock.reentrant_lock.lock_method.lock_method_test2;

/**
 * 方法 int getQueueLength()的作用
 * 返回正等待获取此锁定的线程估计数，
 * 比如有5个线程，1个线程首先执行await()方法,
 * 那么在调用getQueueLength()方法后返回值是4，
 * 说明有4个线程同时在等待lock的释放
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.serviceMethod1();
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
		System.out.println("有线程数：" + service.lock.getQueueLength()
		+ "在等待获取锁！");
	}
}
