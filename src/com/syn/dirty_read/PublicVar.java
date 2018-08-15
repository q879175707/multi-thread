package com.syn.dirty_read;

/**
 * 多个线程调用一个方法时，为了避免数据出现交叉的情况，使用synchronized关键字进行同步
 * 虽然在赋值时进行了同步，但是在取值的时候有可能出现一些意想不到的意外，这种情况就是脏读。
 * 发生脏读的情况是在读取实例变量的时候，此值已经被其他线程更改过了。
 * @author Administrator
 *
 */
public class PublicVar {
	public String username = "A";
	public String password = "AA";
	
	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getValue () {
		System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
	}
}
