package com.etc.state_test4;

/**
 * 执行wait方法后，线程的状态枚举值就是WAITING
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main 方法中t的状态：" + t.getState());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
