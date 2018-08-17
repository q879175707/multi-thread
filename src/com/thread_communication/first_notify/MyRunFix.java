package com.thread_communication.first_notify;

public class MyRunFix {
	private String lock = new String("");
	private boolean isFirstRunB = false;
	
	private Runnable runnableA = new Runnable() {
		
		@Override
		public void run() {
			try {
				synchronized (lock) {
					while(isFirstRunB == false) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end   wait");
					}
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
				isFirstRunB = true;
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		MyRunFix run = new MyRunFix();
		
		// 如果过早通知仅仅执行了notify
		/*Thread b = new Thread(run.runnableB);
		b.start();
		
		Thread.sleep(100);
		
		Thread a = new Thread(run.runnableA);
		a.start();*/
		
		// 运行结果正确，得到了通知。
		Thread a = new Thread(run.runnableA);
		a.start();
		
		Thread.sleep(100);
		
		Thread b = new Thread(run.runnableB);
		b.start();
		
		
	}
}
