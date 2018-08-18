package com.thread_communication.wait_notify.p_c_all_wait;

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
					System.out.println("������" + Thread.currentThread().getName() + " WAITING�ˡ�");
					lock.wait();
				}
				
				System.out.println("������" + Thread.currentThread().getName() + " Runable��");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}