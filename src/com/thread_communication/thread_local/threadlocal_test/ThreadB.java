package com.thread_communication.thread_local.threadlocal_test;

public class ThreadB extends Thread{
	
	@Override
	public void run() {
		super.run();
			try {
				for (int i = 0; i < 100; i++) {
					Tools.t1.set("ThreadB" + (i + 1));
					System.out.println("ThreadB get Valuje="
							+ Tools.t1.get());
				Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
