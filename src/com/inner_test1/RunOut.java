package com.inner_test1;

import com.inner_test1.OutClass.Inner;

/**
 * ���в�ͬ�Ķ������������ӡ���������ġ��첽��
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
