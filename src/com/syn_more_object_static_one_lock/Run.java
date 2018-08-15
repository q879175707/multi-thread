package com.syn_more_object_static_one_lock;

/**
 * Class锁(static)
 * 可以对类的所有对象实例起作用。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		ThreadA a = new ThreadA(service1);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service2);
		b.setName("B");
		b.start();
	}
}
