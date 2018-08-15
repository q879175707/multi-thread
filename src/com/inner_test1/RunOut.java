package com.inner_test1;

import com.inner_test1.OutClass.Inner;

/**
 * 持有不同的对象监视器，打印结果是乱序的。异步的
 * @author Administrator
 *
 */
public class RunOut {
	public static void main(String[] args) {
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				inner.method1();
			}
		},"A");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				inner.method2();
			}
		},"B");
		
		t1.start();
		t2.start();
	}
}
