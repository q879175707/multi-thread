package com.thread_communication.thread_local.threadlocl22;

public class Run {
	public static ThreadLocalExt t1 = new ThreadLocalExt();
	
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("��δ�Ź�ֵ");
			t1.set("�ҵ�ֵ");
		}
		
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
