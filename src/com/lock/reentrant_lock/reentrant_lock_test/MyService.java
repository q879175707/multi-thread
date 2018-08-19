package com.lock.reentrant_lock.reentrant_lock_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ����ReentrantLock�����lock()������ȡ��������unlock()�����ͷ�����
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
