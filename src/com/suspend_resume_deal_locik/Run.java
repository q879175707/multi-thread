package com.suspend_resume_deal_locik;

public class Run {
	public static void main(String[] args) {
		try {
			final SynchronizedObject obj = new SynchronizedObject();
			Thread thread1 = new Thread() {
				public void run() {
					obj.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread() {
				@Override
				public void run() {
					super.run();
					System.out.println("thread2启动了，但进入不了printString()方法！只打印1个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了！");
					obj.printString();
				}
			};
			
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
