package com.etc.auto_add_group;

/**
 * ʵ����һ���߳��飬�����ָ���������߳��飬���Զ���������ǰ�̶߳����������߳����С�Ҳ������ʽ����һ���߳����������һ�����߳��顣
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		System.out.println("A���̣߳�" + Thread.currentThread().getName()
				+ " �������߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " �����߳��������� "
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup group = new ThreadGroup("�µ���");// �Զ���ӵ�main����
		
		System.out.println("B���̣߳�" + Thread.currentThread().getName()
				+ " �������߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " �����߳��������� "
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("first group name:" + threadGroup[i].getName());
		}
	}
}
