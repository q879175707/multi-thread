package com.t7;

/**
 * ����synchronized���о����첽ִ�У���synchronized���о���ͬ��ִ��
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		Task task = new Task();
		Thread1 a = new Thread1(task);
		a.start();
		Thread2 b = new Thread2(task);
		b.start();
	}
}
