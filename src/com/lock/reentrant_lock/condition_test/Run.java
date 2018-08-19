package com.lock.reentrant_lock.condition_test;

/**
 * 通过使用condition对象，成功实现交替打印的效果。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
		ThreadB b = new ThreadB(service);
		b.start();
	}
}
