package com.thread_communication.p_c_all_wait;

/**
 * 虽然已经通过wait/notify通信了，但不能保证notify唤醒的是异类，也许
 * 是同类，比如“生产者”唤醒“生产者”，或“消费者”唤醒“消费者”这样的情况。
 * 
 * 这样的情况运行的比率积少成多，就会导致所有的线程都不能继续运行下去，大家都
 * 在等待，都呈waiting状态，程序也就假死下去了。
 * 
 * 假死出现的主要原因是有可能连续唤醒同类。解决办法，不光唤醒同类，将异类也
 * 一同唤醒就解决了。
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		
		P p = new P(lock);
		C c = new C(lock);
		
		// 两个生产者,两个消费者
		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] cThread = new ThreadC[2];
		
		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));
			
			cThread[i] = new ThreadC(c);
			cThread[i].setName("消费者" + (i + 1));
			
			pThread[i].start();
			cThread[i].start();
		}
		
		Thread.sleep(5000);
		
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + "——"
					+ threadArray[i].getState());
		}
	}
}
