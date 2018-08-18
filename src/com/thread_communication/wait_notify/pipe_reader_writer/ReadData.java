package com.thread_communication.wait_notify.pipe_reader_writer;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
	
	public void readMethod(PipedReader input) {
		try {
			System.out.println("read: ");
			char[] bytes = new char[20];
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
