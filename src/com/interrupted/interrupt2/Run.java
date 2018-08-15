package com.interrupted.interrupt2;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}
