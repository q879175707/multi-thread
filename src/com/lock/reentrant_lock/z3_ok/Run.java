package com.lock.reentrant_lock.z3_ok;

/**
 * 控制台只打印了一个字母A，原因是调用了condition对象的await方法，使当前
 * 执行任务的线程进入了等待waiting状态。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		MyThreadA a = new MyThreadA(service);
		a.start();
	}
}
