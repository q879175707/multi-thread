package com.thread_communication.join.join_long;

/**
 * join(2000)和sleep(2000)有什么区别呢？
 * 方法join(long)的功能在内部是使用wait(long)方法来实现的，
 * 所以join方法具有释放锁的特点。
 * 当执行wait方法后，当前线程的锁被释放，那么其他线程就可以调用此
 * 线程中的同步方法了。
 * 
 * 而Thread.sleep(long)方法却不释放锁
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.join(2000);
//			Thread.sleep(2000);
			System.out.println("end time =" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
