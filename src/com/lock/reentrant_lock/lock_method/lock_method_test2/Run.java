package com.lock.reentrant_lock.lock_method.lock_method_test2;

/**
 * ���� int getQueueLength()������
 * �������ȴ���ȡ���������̹߳�������
 * ������5���̣߳�1���߳�����ִ��await()����,
 * ��ô�ڵ���getQueueLength()�����󷵻�ֵ��4��
 * ˵����4���߳�ͬʱ�ڵȴ�lock���ͷ�
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
		System.out.println("���߳�����" + service.lock.getQueueLength()
		+ "�ڵȴ���ȡ����");
	}
}
