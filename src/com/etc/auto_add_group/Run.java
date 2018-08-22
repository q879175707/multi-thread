package com.etc.auto_add_group;

/**
 * 实例化一个线程组，如果不指定所属的线程组，则自动归属到当前线程对象所属的线程组中。也就是隐式的在一个线程组中添加了一个子线程组。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("A处线程：" + Thread.currentThread().getName()
				+ " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程组数量： "
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup group = new ThreadGroup("新的组");// 自动添加到main组中
		
		System.out.println("B处线程：" + Thread.currentThread().getName()
				+ " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程组数量： "
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("first group name:" + threadGroup[i].getName());
		}
	}
}
