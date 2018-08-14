package com.suspend;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
			
			// A¶Î
			thread.suspend();
			System.out.println("A=" + System.currentTimeMillis() + " i =" + thread.getI());
			Thread.sleep(5000);
			System.out.println("A=" + System.currentTimeMillis() + " i =" + thread.getI());
			
			// B¶Î
			thread.resume();
			Thread.sleep(5000);
			
			// C¶Î
			thread.suspend();
			System.out.println("B=" + System.currentTimeMillis() + " i =" + thread.getI());
			Thread.sleep(5000);
			System.out.println("B=" + System.currentTimeMillis() + " i =" + thread.getI());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
