package com.thread_communication.wait_notify.two_thread_trans_data;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List<String> list = new ArrayList<>();
	
	public void add() {
		list.add("������");
	}
	
	public int size() {
		return list.size();
	}
}
