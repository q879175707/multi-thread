package com.lock.reentrant_lock.use_more_condition_ok;

/**
 * 程序运行后，只有线程A被唤醒了。
 * 通过实验可以得知，使用ReentranLock对象可以唤醒指定种类的线程，
 * 这是控制部分线程行为的方便方式。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		
		Thread.sleep(3000);
		service.signalAll_A();
	}
}
