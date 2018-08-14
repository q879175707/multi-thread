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
					System.out.println("thread2�����ˣ������벻��printString()������ֻ��ӡ1��begin");
					System.out.println("��ΪprintString()������a�߳�����������Զsuspend��ͣ�ˣ�");
					obj.printString();
				}
			};
			
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
