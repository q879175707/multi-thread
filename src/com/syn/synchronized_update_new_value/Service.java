package com.syn.synchronized_update_new_value;

public class Service {

	private boolean isCountinueRun = true;
	public void runMethod() {
		while (isCountinueRun == true) {
			synchronized ("") {
				
			}
		}
		
		System.out.println("ͣ�����ˣ�");
	}
	
	public void stopMethod() {
		isCountinueRun = false;
	}
}
