package com.thread_communication.join.join_test1;

public class Run {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
//		Thread.sleep(?);
		System.out.println("我想当thread对象执行完毕后我再执行");
		System.out.println("但上面sleep中的值该填多少呢");
		System.out.println("不能确定");
	}
}
