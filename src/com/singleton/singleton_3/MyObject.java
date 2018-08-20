package com.singleton.singleton_3;

public class MyObject {
	
	private static MyObject myObject;
	private MyObject(){
	}
	
	public static MyObject getInstance() {
		try {
				if(myObject != null) {
				} else {
					// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
					Thread.sleep(3000);
					synchronized (MyObject.class) {
						myObject = new MyObject();
					}
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
