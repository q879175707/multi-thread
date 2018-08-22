package com.etc.state_test1;

/**
 * ���췽���е�״̬��RUNNABLE 
 * main �����е�״̬1��NEW 
 * Run�����е�״̬��RUNNABLE 
 * main �����е�״̬2��TERMINATED
 * 
 * ���췽���д�ӡ��״̬����ʾmain���̵߳�״̬ΪRunnable
 * 
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			MyThread t = new MyThread();
			System.out.println("main �����е�״̬1��" + t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("main �����е�״̬2��" + t.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
