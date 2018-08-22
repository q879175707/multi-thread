package com.etc.group_add_thread_more_level;

/**
 * main组加入新组A，A中加入新的线程。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					System.out.println("run Method!");
					Thread.sleep(10000); // 线程必须在运行状态才可以受组管理
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start(); // 线程必须启动然后才能归到组A中。
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		
		System.out.println("main线程中有多少个子线程组:" + listGroup.length +
				" 名字为：" + listGroup[0].getName());
		
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		
		System.out.println(listThread[0].getName());
		
	}
}
