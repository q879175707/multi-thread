package com.thread_communication.join.join_sleep_1;

/**
 * 由于线程ThreadA使用Thread.sleep(long)方法一直持有ThreadB对象
 * 的锁，时间达到6秒，所以线程C只有在ThreadA时间到达6秒后释放ThreadB的
 * 锁时，才可以调用ThreadB中的同步方法synchronized public void bService()
 * 
 * 正面Thread.sleep()方法不释放锁
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			
			Thread.sleep(1000);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
