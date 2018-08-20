package com.timer.timer_test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer��cancel������TimerTask��ͬ
 * Timer���е�cancel�����ǽ���������е�
 * ȫ��������գ����ҽ��̱����١�
 * @author Administrator
 */
public class Run3 {
	private static Timer timer = new Timer();
	public static class MyTaskA extends TimerTask {
		@Override
		public void run() {
				System.out.println("A �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
				timer.cancel();
		}
	}
	public static class MyTaskB extends TimerTask {
		@Override
		public void run() {
			System.out.println("B �����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA taskA = new MyTaskA();
			MyTaskB taskB = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-20 11:21:00";
			Date date = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + "��ǰʱ�䣺"+new Date().toLocaleString());
			timer.schedule(taskA, date, 4000);
			timer.schedule(taskB, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
