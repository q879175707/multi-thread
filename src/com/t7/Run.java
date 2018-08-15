package com.t7;

/**
 * 不再synchronized块中就是异步执行，在synchronized块中就是同步执行
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		Thread1 a = new Thread1(task);
		a.start();
		Thread2 b = new Thread2(task);
		b.start();
	}
}
