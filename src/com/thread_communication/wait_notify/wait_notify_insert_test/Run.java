package com.thread_communication.wait_notify.wait_notify_insert_test;

/**
 * �ȴ�/֪֮ͨ���汸�ݣ�һ�����߳̽����ݱ��ݵ�A���ݿ��У���һ�����߳̽����ݱ��ݵ�B���ݿ���
 * ���ұ���A���ݿ��B���ݿ��ǽ�����еġ�
 * @author Administrator
 *
 */
public class Run {
	public static void main(String[] args) {
		DBTools dbTools = new DBTools();
		for (int i = 0; i < 20; i++) {
			BackupB output = new BackupB(dbTools);
			output.start();
			
			BackupA input = new BackupA(dbTools);
			input.start();
		}
	}
}
