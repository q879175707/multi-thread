package com.lock.reentrant_lock.fair_no_fair_test;

/**
 * ��ӡ�Ľ��������������ģ���˵����start()�������̲߳������Ȼ������
 * @author Administrator
 *
 */
public class RunNotFair {
	public static void main(String[] args) {
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("���߳� " + Thread.currentThread().getName() + "������");
				service.serviceMethod();
			}
		};
		Thread[] thread = new Thread[10];
		for (int i = 0; i < 10; i++) {
			thread[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			thread[i].start();
		}
	}
}
