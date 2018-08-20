package com.singleton.singleton_1;

public class MyObject {
	private static MyObject myObject;
	
	private MyObject(){
		
	}
	
	public static MyObject getInstance() {
		if(myObject != null) {
			
		} else {
			myObject = new MyObject();
		}
		
		return myObject;
	}
}
