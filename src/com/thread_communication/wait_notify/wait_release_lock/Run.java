package com.thread_communication.wait_notify.wait_release_lock;

/**
 * wait()×Ô¶¯ÊÍ·ÅËø
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
	}
}
