package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask���cancel�����ǽ�����Ӷ����б��Ƴ�������������Ӱ��
 * @author Administrator
 *
 */
public class Run2 {
	public static class MyTaskA extends TimerTask {
		@Override
		public void run() {
			System.out.println("A�����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
			this.cancel();
		}
	}
	public static class MyTaskB extends TimerTask {
		@Override
		public void run() {
			System.out.println("B�����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);
			Timer timer = new Timer();
			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + "��ǰʱ�䣺"+new Date().toLocaleString());
			timer.schedule(taskA, date, 4000);
			timer.schedule(taskB, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
