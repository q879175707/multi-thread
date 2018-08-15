package com.syn_block_string;

public class Service {
	private String usernameParam;
	private String passwordParam;
	// 多线程获得同一个锁
	private String anyString = new String();
	
	public void setUsernamePassword(String username, String password) {
		try {
			// 多线程获得不同的锁对象
//			String anyString = new String();
			synchronized(anyString) {
				System.out.println(" 线程的名称为：" + Thread.currentThread().getName()
						 + " 在 " + System.currentTimeMillis() + " 进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println(" 线程的名称为：" + Thread.currentThread().getName()
						 + " 在 " + System.currentTimeMillis() + " 离开同步块");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
