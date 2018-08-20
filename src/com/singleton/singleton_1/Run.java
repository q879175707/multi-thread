package com.singleton.singleton_1;

/**
 * 虽然取得一个对象的实例，但如果在多线程环境中，会出现多个实例的情况。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}
}
