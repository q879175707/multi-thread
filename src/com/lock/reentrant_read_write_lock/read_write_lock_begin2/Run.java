package com.lock.reentrant_read_write_lock.read_write_lock_begin2;

/**
 * 使用写锁代码lock.writeLock()的效果就是同一时间只允许一个线程
 * 执行lock方法后面的代码。
 *
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
