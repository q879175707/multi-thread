package com.interrupted.interrupt;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
			System.out.println("ÊÇ·ñÍ£Ö¹ 1£¿=" + thread.interrupted());
			System.out.println("ÊÇ·ñÍ£Ö¹ 2£¿=" + thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
