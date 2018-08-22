package com.etc.thread_create_exception;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * 方法setUncaughtExceptionHandler是给指定线程对象设置的异常处理器。
 * 在Thread类中还可以使用setDefaultUncaughtExceptionHandler方法对
 * 所有的线程对象设置异常处理器。
 * @author Administrator
 *
 */
public class Main2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + " 出现了异常");
				e.printStackTrace();
			}
		});
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}
}
