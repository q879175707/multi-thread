package com.etc.state_test3;

/**
 * b�߳�һֱ�ڵȴ�a�߳��ͷ���������b���ǵ�״̬����BLOCKED
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThreadA a = new MyThreadA();
		a.setName("A");
		a.start();
		
		MyThreadB b = new MyThreadB();
		b.setName("B");
		b.start();
		Thread.sleep(10);
		System.out.println("main������b״̬��" + b.getState());
	}
}
