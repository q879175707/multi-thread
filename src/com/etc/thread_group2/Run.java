package com.etc.thread_group2;

/**
 * 自定义ThreadGroup线程组，重写UncaughtException方法处理组内线程中断行为
 * 每个对象的run方法内不要有异常catch语句，如果有catch语句，则重写的异常处理方法不执行。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThread[] myThread = new MyThread[10];
		
		for (int i = 0; i < 10; i++) {
			myThread[i] = new MyThread(group, "线程" + (i + 1), "1");
			myThread[i].start();
		}
		
		MyThread newT = new MyThread(group, "出错线程", "a");
		newT.start();
	}
}
