package com.lock.reentrant_lock.reentrant_lock_test;

/**
 * 从运行结果看，当前线程打印完毕之后将锁释放，其他线程才可以继续打印。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);
		MyThread a5 = new MyThread(service);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
	}
}
