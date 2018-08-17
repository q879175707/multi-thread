package com.thread_communication.wait_has_param_method;

/**
 * 带一个参数的wait(long)方法的功能是等待某一时间内是否有线程对锁进行唤醒，
 * 如果超过这个时间则自动唤醒。
 * @author Administrator
 *
 */
public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {

		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer=" + System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait end    timer=" + System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static private Runnable runnable2 = new Runnable() {

		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer=" + System.currentTimeMillis());
				lock.notify();
				System.out.println("notify end    timer=" + System.currentTimeMillis());
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(runnable1);
		t.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
