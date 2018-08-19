package com.lock.reentrant_lock.use_condition_wait_notify_ok;

/**
 * 成功实现等待/通知模式。
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
