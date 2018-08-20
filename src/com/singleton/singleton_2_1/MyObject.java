package com.singleton.singleton_2_1;

public class MyObject {
	
	private static MyObject myObject;
	private MyObject(){
	}
	
	synchronized public static MyObject getInstance() {
		try {
			if(myObject != null) {
			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}