package com.volatile_test.atomic_interger_no_safe;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {
	public static AtomicLong aiRef = new AtomicLong();
	
	synchronized public void addNum(){
		System.out.println(Thread.currentThread().getName() + " ����100֮���ֵ�ǣ�"
				+ aiRef.addAndGet(100));
		
		aiRef.addAndGet(1);
	}
}
