package com.thread_communication.wait_notify.pipe_input_output;

import java.io.PipedInputStream;

public class ThreadRead extends Thread{
	
	private ReadData read;
	private PipedInputStream input;
	
	public ThreadRead(ReadData read, PipedInputStream input) {
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		super.run();
		read.readMethod(input);
	}
}
