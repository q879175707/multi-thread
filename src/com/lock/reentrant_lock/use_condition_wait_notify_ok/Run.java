package com.lock.reentrant_lock.use_condition_wait_notify_ok;

/**
 * �ɹ�ʵ�ֵȴ�/֪ͨģʽ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		Thread.sleep(3000);
		service.signal();
	}
}
