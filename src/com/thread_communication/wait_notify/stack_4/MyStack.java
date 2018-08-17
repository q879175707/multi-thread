package com.thread_communication.wait_notify.stack_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 生产者向堆栈list对象中放入数据。使消费者从list堆栈中取出数据。
 * List最大容量是1，实验环境只有一个生产者与一个消费者。
 * @author Administrator
 *
 */
public class MyStack {
	
	private List<String> list = new ArrayList<>();
	
	synchronized public void push() {
		try {
			while (list.size() == 1) {
				this.wait();
			}
			list.add("anyString=" + Math.random());
			this.notifyAll();
			System.out.println("push=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized public String pop() {
		String returnValue = "";
		try {
			while (list.size() == 0) {
				System.out.println("pop操作中的："
						+ Thread.currentThread().getName() + "线程呈wait状态");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notifyAll();
			System.out.println("pop=" + list.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
