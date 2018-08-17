package com.thread_communication.notify_one;

/**
 * NotifyThread中如果使用notify值唤醒一个线程，使用notifyAll唤醒所有线程。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
		ThreadC c = new ThreadC(lock);
		c.start();
		Thread.sleep(1000);
		NotifyTread notifyTread = new NotifyTread(lock);
		notifyTread.start();
	}
}
