package com.lock.reentrant_read_write_lock.read_write_lock_begin3;

/**
 *获得读锁后，等read方法执行完毕，才能执行write方法
 *说明“读写”操作是互斥的
 *
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		Thread.sleep(1000);
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
