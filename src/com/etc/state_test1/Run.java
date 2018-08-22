package com.etc.state_test1;

/**
 * 构造方法中的状态：RUNNABLE 
 * main 方法中的状态1：NEW 
 * Run方法中的状态：RUNNABLE 
 * main 方法中的状态2：TERMINATED
 * 
 * 构造方法中打印的状态是显示main主线程的状态为Runnable
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			System.out.println("main 方法中的状态1：" + t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("main 方法中的状态2：" + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
