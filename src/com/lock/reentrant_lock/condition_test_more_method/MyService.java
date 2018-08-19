package com.lock.reentrant_lock.condition_test_more_method;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	
	public void methodA() {
		try {
			lock.lock();
			System.out.println("methodA begin ThreadName="
					+Thread.currentThread().getName()+ "	timer="
					+System.currentTimeMillis());
			
			Thread.sleep(5000);
			
			System.out.println("methodA end    ThreadName="
					+Thread.currentThread().getName() + "	timer="
					+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void methodB() {
		try {
			lock.lock();
			System.out.println("methodB begin ThreadName="
					+Thread.currentThread().getName()+ "	timer="
					+System.currentTimeMillis());
			
			Thread.sleep(5000);
			
			System.out.println("methodB end    ThreadName="
					+Thread.currentThread().getName() + "	timer="
					+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
