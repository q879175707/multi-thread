package com.thread_communication.wait_notify.p_c_all_wait_fix;

/**

 * 假死出现的主要原因是有可能连续唤醒同类。解决办法，不光唤醒同类，将异类也
 * 一同唤醒就解决了。使用notifyAll方法
 * @author Administrator
 */
public class Run {
	public static void main(String[] args) throws Exception {
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
