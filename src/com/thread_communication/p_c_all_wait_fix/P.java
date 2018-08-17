package com.thread_communication.p_c_all_wait_fix;

// producer
public class P {
	private String lock;
	public P(String lock) {
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")){
					System.out.println("生产者" + Thread.currentThread().getName() + " WAITING了★");
					lock.wait();
				}
				
				System.out.println("生产者" + Thread.currentThread().getName() + " Runable了");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
