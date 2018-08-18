package com.thread_communication.wait_notify.wait_notify_insert_test;

/**
 * 等待/通知之交叉备份，一部分线程将数据备份到A数据库中，另一部分线程将数据备份到B数据库中
 * 并且备份A数据库和B数据库是交叉进行的。
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
