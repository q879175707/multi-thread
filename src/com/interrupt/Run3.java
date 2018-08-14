package com.interrupt;

public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.interrupt();
			Thread.sleep(1000);
			System.out.println("�Ƿ�ֹͣ 1��=" + thread.isInterrupted());
			System.out.println("�Ƿ�ֹͣ 2��=" + thread.isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}
}
