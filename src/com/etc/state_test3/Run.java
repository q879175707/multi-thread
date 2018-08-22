package com.etc.state_test3;

/**
 * b线程一直在等待a线程释放锁，所以b但是的状态就是BLOCKED
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
		System.out.println("main方法中b状态：" + b.getState());
	}
}
