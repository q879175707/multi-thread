package com.singleton.singleton_0;

public class MyObject {
	// 立即加载方式
	
	private static MyObject myObject = new MyObject();
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		// 此代码版本为立即加载，缺点是不能有其他实例变量
		// 因为getInstance()没有同步，所以有可能出现非线程安全问题
		return myObject;
	}
}
