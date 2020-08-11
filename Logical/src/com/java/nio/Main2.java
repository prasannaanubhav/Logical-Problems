package com.java.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main2 {

	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("data.dat")) {

			FileChannel fileChannel = fileOutputStream.getChannel();
			byte[] ouputBytes = "Hello World".getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(ouputBytes);
			fileChannel.write(buffer);
			ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
			intBuffer.putInt(245);
			intBuffer.flip();
			fileChannel.write(intBuffer);
			
			RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
			byte[] b =new byte[ouputBytes.length];
			ra.read(b);
			int a = ra.readInt();
			System.out.println(new String(b));
			System.out.println(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
