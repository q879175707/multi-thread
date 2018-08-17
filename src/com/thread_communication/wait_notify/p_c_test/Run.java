package com.thread_communication.wait_notify.p_c_test;

/**
 * 一个生产者和一个消费者进行数据的交互，在控制台打印的日志中get和set是交替运行的
 * 
 * 如果在此基础上设计多个生产者和多个消费者，那么在运行过程中极有可能出现“假死”的情况，
 * 也就是所有的线程都呈wating等待状态
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		String lock = new String("");
		P p = new P(lock);
		C c = new C(lock);
		ThreadP pThread = new ThreadP(p);
		ThreadC cThread = new ThreadC(c);
		pThread.start();
		cThread.start();
	}
}
