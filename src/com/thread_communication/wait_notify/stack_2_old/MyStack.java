package com.thread_communication.wait_notify.stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������ջlist�����з������ݡ�ʹ�����ߴ�list��ջ��ȡ�����ݡ�
 * List���������1��ʵ�黷��ֻ��һ����������һ�������ߡ�
 * @author Administrator
 *
 */
public class MyStack {
	
	private List<String> list = new ArrayList<>();
	
	synchronized public void push() {
		try {
			if (list.size() == 1) {
				System.out.println("push�����е�"
						+ Thread.currentThread().getName() + "��wait״̬");
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notify();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String returnValue = "";
		try {
			if (list.size() == 0) {
				System.out.println("pop�����еģ�"
						+ Thread.currentThread().getName() + "�̳߳�wait״̬");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop=" + list.size() + Thread.currentThread().getName() + "�������߳�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}