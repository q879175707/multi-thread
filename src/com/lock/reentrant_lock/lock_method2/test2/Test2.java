package com.lock.reentrant_lock.lock_method2.test2;

/**
 * ����boolean hasWaiters(Condition condition)������
 * ��ѯ�Ƿ����߳����ڵȴ�������йص�condition����
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
