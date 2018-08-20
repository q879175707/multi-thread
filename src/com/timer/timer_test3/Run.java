package com.timer.timer_test3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, long delay)
 * �Ե�ǰʱ��Ϊ�ο����ڴ�ʱ��������ӳ�ָ���ĺ�������ִ��һ��TimerTask����
 */
public class Run {
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ��" + new Date().toLocaleString());
		}
	}
	
	public static void main(String[] args) {
		MyTask task  = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ�䣺" + new Date().toLocaleString());
		
		// �ӳ�7���ִ�С�
		timer.schedule(task, 7000);
	}
}
