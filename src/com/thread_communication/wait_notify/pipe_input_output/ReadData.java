package com.thread_communication.wait_notify.pipe_input_output;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
	
	public void readMethod(PipedInputStream input) {
		try {
			System.out.println("read: ");
			byte[] bytes = new byte[20];
			int readLength = input.read(bytes);
			while(readLength != -1) {
				String newData = new String(bytes, 0, readLength);
				System.out.print(newData);
				readLength = input.read(bytes);
			}
			System.out.println();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
