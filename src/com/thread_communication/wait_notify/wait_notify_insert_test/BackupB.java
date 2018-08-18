package com.thread_communication.wait_notify.wait_notify_insert_test;

public class BackupB extends Thread{
	
	private DBTools dbTools;
	
	public BackupB(DBTools dbTools) {
		this.dbTools = dbTools;
	}
	
	@Override
	public void run() {
		super.run();
		dbTools.backupB();
	}

}
