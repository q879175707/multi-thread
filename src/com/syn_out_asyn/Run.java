package com.syn_out_asyn;

/**
 * 多个线程调用同一个方法是随机的
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyList list = new MyList();
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
	}
}
