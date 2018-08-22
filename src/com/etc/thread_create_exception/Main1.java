package com.etc.thread_create_exception;

/**
 * 在java的多线程技术中，可以对多线程中的异常进行“捕捉”
 * 使用的是UncaughtExceptionHandler类，从而可以
 * 对发生的异常进行有效的处理。
 * @author Administrator
 *
 */
public class Main1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
