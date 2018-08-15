package com.t9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 只能放一个元素的集合
 * @author Administrator
 *
 */
public class MyOneList {
	private List list = new ArrayList<>();
	
	synchronized public void add(String data) {
		list.add(data);
	};
	
	synchronized public int getSize() {
		return list.size();
	};
	
	public List get(){
		return list;
	}
}
