package com.singleton.singleton_0;

public class MyObject {
	// �������ط�ʽ
	
	private static MyObject myObject = new MyObject();
	
	private MyObject() {
		
	}
	
	public static MyObject getInstance() {
		// �˴���汾Ϊ�������أ�ȱ���ǲ���������ʵ������
		// ��ΪgetInstance()û��ͬ���������п��ܳ��ַ��̰߳�ȫ����
		return myObject;
	}
}
