package com.thread_communication.join.join_test2;

/**
 * 方法join的作用是使所属的线程对象x正常执行run方法中的任务，
 * 等待线程x销毁后再继续执行线程z后面的代码。
 * 
 * 方法join具有使线程排队运行的多用，有些类似同步的运行效果。
 * join与synchronized的区别是：
 * join在内部使用wait()方法进行等待，而synchronized关键字
 * 使用的是对象监视器原理作为同步。
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.join();
			System.out.println("我想当thread对象执行完毕后我再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
