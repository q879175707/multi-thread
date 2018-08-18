package com.thread_communication.wait_notify.wait_notify_insert_test;

public class BackupA extends Thread{
	
	private DBTools dbTools;
	
	public BackupA(DBTools dbTools) {
		this.dbTools = dbTools;
	}
	
	@Override
	public void run() {
		super.run();
		dbTools.backupA();
	}

}
