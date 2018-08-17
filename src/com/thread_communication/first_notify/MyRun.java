package com.thread_communication.first_notify;

public class MyRun {
	private String lock = new String("");
	private Runnable runnableA = new Runnable() {
		
		@Override
		public void run() {
			try {
				synchronized(lock) {
					System.out.println("begin wait");
					lock.wait();
					System.out.println("end   wait");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable() {
		
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end   notify");
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		MyRun run = new MyRun();
		Thread a = new Thread(run.runnableA);
		Thread b = new Thread(run.runnableB);
		b.start();
		// ֪ͨ���磬�����ҳ�������������߼���
		// �����֪ͨ�ˣ���wait����Ҳ��û�б�Ҫִ���ˡ�
		Thread.sleep(100);
		a.start();
	}
}
