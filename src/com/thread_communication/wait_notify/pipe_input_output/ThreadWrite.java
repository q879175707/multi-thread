package com.thread_communication.wait_notify.pipe_input_output;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread{
	
	private WriteData write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteData write, PipedOutputStream out) {
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		super.run();
		write.writeMethod(out);
	}
}
