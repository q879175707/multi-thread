package com.lock.reentrant_lock.lock_method.lock_method_test3;

/**
 * ���� int getWaitQueueLength(Condition condition)������
 * �Ƿ��صȴ����������صĸ�������Condition���̹߳�����
 * ������5���̣߳�ÿ���̶߳�ִ����ͬһ��condition�����await��������
 * �����getWaitQueueLength(Condition condition)�������ص�int
 * ֵ��5.
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
