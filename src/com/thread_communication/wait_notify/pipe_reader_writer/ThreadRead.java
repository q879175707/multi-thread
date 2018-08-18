package com.thread_communication.wait_notify.pipe_reader_writer;

import java.io.PipedReader;

public class ThreadRead extends Thread{
	
	private ReadData read;
	private PipedReader input;
	
	public ThreadRead(ReadData read, PipedReader input) {
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		super.run();
		read.readMethod(input);
	}
}
