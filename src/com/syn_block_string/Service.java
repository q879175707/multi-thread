package com.syn_block_string;

public class Service {
	private String usernameParam;
	private String passwordParam;
	// ���̻߳��ͬһ����
	private String anyString = new String();
	
	public void setUsernamePassword(String username, String password) {
		try {
			// ���̻߳�ò�ͬ��������
//			String anyString = new String();
			synchronized(anyString) {
				System.out.println(" �̵߳�����Ϊ��" + Thread.currentThread().getName()
						 + " �� " + System.currentTimeMillis() + " ����ͬ����");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println(" �̵߳�����Ϊ��" + Thread.currentThread().getName()
						 + " �� " + System.currentTimeMillis() + " �뿪ͬ����");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
