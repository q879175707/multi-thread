package com.timer.timer_test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * �������к�Ѹ�ٽ�����ǰ�Ľ��̣�����TimerTask�е������ٱ����У���Ϊ�����Լ������ˡ�
 * ����ƻ�����ʱ�����ڵ�ǰʱ��������ִ��task����
 * @author Administrator
 *
 */
public class Run1TimerIsDaemon {
	private static Timer timer = new Timer(true);
	
	public static class MyTask extends TimerTask {
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2018-8-19 20:34:00";
			Date date = sdf.parse(dateString);
			System.out.println("�ַ���ʱ�䣺" + date.toLocaleString() + " ��ǰʱ�䣺" + new Date().toLocaleString());
			timer.schedule(task, date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
