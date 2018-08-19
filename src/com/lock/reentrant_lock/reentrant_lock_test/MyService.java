package com.lock.reentrant_lock.reentrant_lock_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 调用ReentrantLock对象的lock()方法获取锁，调用unlock()方法释放锁。
 * @author Administrator
 *
 */
public class MyService {
	private Lock lock = new ReentrantLock();
	
	public void method() {
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1)));
		}
		lock.unlock();
	}
}	
