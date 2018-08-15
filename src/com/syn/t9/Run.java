package com.syn.t9;

import java.util.Iterator;
import java.util.List;

/**
 * 在myservice的判断list大小与添加数据上没有加synchronized会发生不想看到的结果
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyOneList list = new MyOneList();
		ThreadA a = new ThreadA(list);
		a.setName("A");
		a.start();
		
		ThreadB b = new ThreadB(list);
		b.setName("B");
		b.start();
		Thread.sleep(6000);
		System.out.println("listSize = " + list.getSize());
		
		List result = list.get();
		Iterator iterator = result.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next.toString());
		}
	}
}
