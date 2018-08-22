package com.etc.thread_create_exception;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * 给所有线程对象设置异常处理器
 * @author Administrator
 *
 */
public class Main3 {
	public static void main(String[] args) {
		MyThread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + " 出现了异常");
				e.printStackTrace();
			}
		});
		
		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}
}
