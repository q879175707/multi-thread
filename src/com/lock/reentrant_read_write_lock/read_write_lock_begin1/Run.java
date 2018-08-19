package com.lock.reentrant_read_write_lock.read_write_lock_begin1;

/**
 * 从结果时间看，两个线程几乎同时进入lock（）方法后面的代码。
 * 说明在此使用了Lock.readLock()读锁可以提高程序运行效率，
 * 允许多个线程同时执行lock（）方法后面的代码
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		b.start();
	}
}
