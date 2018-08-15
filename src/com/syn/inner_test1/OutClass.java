package com.syn.inner_test1;

public class OutClass {
	static class Inner{
		public void method1() {
			synchronized("������") {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+ " i=" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}	
		}// end method1
		
		public synchronized void method2() {
			for (int i = 11; i < 20; i++) {
				System.out.println(Thread.currentThread().getName()+ " i=" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}// end Inner
}
