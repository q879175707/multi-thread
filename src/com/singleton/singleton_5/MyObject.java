package com.singleton.singleton_5;

public class MyObject {
	
	private volatile static MyObject myObject;
	private MyObject(){
	}
	
	public static MyObject getInstance() {
		try {
				if(myObject != null) {
				} else {
					// 模拟在创建对象之前做一些准备性的工作
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
