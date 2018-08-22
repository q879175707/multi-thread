package com.etc.group_add_thread_more_level;

/**
 * main���������A��A�м����µ��̡߳�
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
					Thread.sleep(10000); // �̱߳���������״̬�ſ����������
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, runnable);
		newThread.setName("Z");
		newThread.start(); // �̱߳�������Ȼ����ܹ鵽��A�С�
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		
		System.out.println("main�߳����ж��ٸ����߳���:" + listGroup.length +
				" ����Ϊ��" + listGroup[0].getName());
		
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		
		System.out.println(listThread[0].getName());
		
	}
}
