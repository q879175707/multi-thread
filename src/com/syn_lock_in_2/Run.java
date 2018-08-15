package com.syn_lock_in_2;

/**
 * 当存在父子类继承关系时
 * 子类是完全可以通过“可重入锁”调用父类的同步方法的。
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}
