package com.lock.reentrant_lock.lock_method2.test1;

/**
 * ����boolean hasQueuedThread(Thread thread)������
 * ��ѯָ���߳��Ƿ����ڵȴ���ȡ������
 * ����boolean hasQueuedThreads()������
 * ��ѯ�Ƿ����߳����ڵȴ���ȡ������
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		
		Thread threadA = new Thread(runnable);
		threadA.start();
		
		Thread.sleep(500);
		
		Thread threadB = new Thread(runnable);
		threadB.start();
		
		Thread.sleep(500);
		
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
