package com.thread_communication.wait_notify.wait_interrupted_exception;

/**
 * 当线程呈wait()状态，调用线程对象的interrupt()方法会出现InterruptedExcetpion异常。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
