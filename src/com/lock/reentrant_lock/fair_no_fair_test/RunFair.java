package com.lock.reentrant_lock.fair_no_fair_test;

/**
 * ��ӡ�Ľ�������������״̬������ǹ�ƽ�����ص㡣
 * @author Administrator
 *
 */
public class RunFair {
	public static void main(String[] args) {
		final Service service = new Service(true);
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
