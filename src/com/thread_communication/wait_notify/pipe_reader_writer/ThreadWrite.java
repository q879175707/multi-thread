package com.thread_communication.wait_notify.pipe_reader_writer;

import java.io.PipedWriter;

public class ThreadWrite extends Thread{
	
	private WriteData write;
	private PipedWriter out;
	
	public ThreadWrite(WriteData write, PipedWriter out) {
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		super.run();
		write.writeMethod(out);
	}
}
