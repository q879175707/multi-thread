package com.thread_communication.two_thread_trans_data;

/**
 * 两个线程虽然实现了通信，但是有个弊端，Threadb不停的通过while语句
 * 循环机制检测某一个条件，这样会浪费CPU资源。
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
