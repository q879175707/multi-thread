package com.syn.syn_not_extends;

public class Sub extends Main {
	@Override
	public synchronized void serviceMethod() {
		try {
			
			System.out.println("int sub next sleep begin threadname ="
					+ Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			
			Thread.sleep(5000);
			
			System.out.println("int sub next sleep end threadname = "
					+Thread.currentThread().getName() + " time = "
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
