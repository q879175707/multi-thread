package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask���Զ��еķ�ʽһ��һ����˳��ִ�еģ�����ִ�е�ʱ���п��ܺ�Ԥ�ڵ�ʱ�䲻һ��
 * ��Ϊǰ��������п������ĵ�ʱ��ϳ����������������е�ʱ��Ҳ�ᱻ�ӳ١�
 * task1 ��Ҫ��ʱ20��ִ��������������Ӱ�쵽��task2
 * @author Administrator
 *
 */
public class Run2Later {
	private static Timer timer = new Timer();
	
	public static class MyTask1 extends TimerTask {
		public void run() {
			try {
				System.out.println("������1��ʱ��Ϊ��" + new Date().toLocaleString());
				Thread.sleep(20000);
				System.out.println("������1��ʱ��Ϊ��" + new Date().toLocaleString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class MyTask2 extends TimerTask {
		public void run() {
				System.out.println("������2��ʱ��Ϊ��" + new Date().toLocaleString());
				System.out.println("������2��ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask1 task1 = new MyTask1();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2018-8-19 20:52:15";
			String dateString2 = "2018-8-19 20:52:20";
			Date date1 = sdf1.parse(dateString1);
			Date date2 = sdf1.parse(dateString2);
			
			System.out.println("�ַ���1ʱ�䣺" + date1.toLocaleString() + " ��ǰʱ�䣺" + new Date().toLocaleString());
			System.out.println("�ַ���2ʱ�䣺" + date2.toLocaleString() + " ��ǰʱ�䣺" + new Date().toLocaleString());
			
			timer.schedule(task1, date1);
			timer.schedule(task2, date2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
