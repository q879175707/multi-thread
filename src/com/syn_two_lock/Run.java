package com.syn_two_lock;

/**
 * 异步的原因是持有不同的锁，一个是对象锁，
 * 另外一个是Class锁（static），而Class锁
 * 可以对类的所有对象实例起作用。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		ThreadC c = new ThreadC(service);
		c.setName("C");
		c.start();
	}
}
