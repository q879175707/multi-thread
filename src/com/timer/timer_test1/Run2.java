package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer�������ж��TimerTask����ע��Timer���������ػ��̡߳�
 * �������Ϊ�ػ��߳�,�����ĳ����û������������̵߳Ľ����ͽ����ˡ�
 * @author Administrator
 *
 */
public class Run2 {
	private static Timer timer = new Timer();
	
	public static class MyTask1 extends TimerTask {
		public void run() {
			System.out.println("������1��ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static class MyTask2 extends TimerTask {
		public void run() {
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
