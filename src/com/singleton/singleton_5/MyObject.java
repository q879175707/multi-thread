package com.singleton.singleton_5;

public class MyObject {
	
	private volatile static MyObject myObject;
	private MyObject(){
	}
	
	public static MyObject getInstance() {
		try {
				if(myObject != null) {
				} else {
					// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
					Thread.sleep(3000);
					synchronized (MyObject.class) {
						if (myObject == null){
							myObject = new MyObject();
						}
					}
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}
}
