package com.lock.reentrant_lock.lock_method2.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void notifyMethod() {
		try {
			lock.lock();
			
			System.out.println("��û���߳����ڵȴ�condition�� "
					+ lock.hasWaiters(condition) + " �߳����Ƕ��٣� "
					+ lock.getWaitQueueLength(condition));
			
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
