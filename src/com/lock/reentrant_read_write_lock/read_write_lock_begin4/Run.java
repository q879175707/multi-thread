package com.lock.reentrant_read_write_lock.read_write_lock_begin4;

/**
 *获得写锁后，等write方法执行完毕，才能执行read方法
 *说明“写读”操作是互斥的
 *
 *“读写”、“写读”、“写写”都是互斥的；而“读读”是异步的，非互斥的
 *只要有写操作就是互斥的。
 *
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		Thread.sleep(1000);
		
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
	}
}
