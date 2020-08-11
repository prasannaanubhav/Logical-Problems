package com.java.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		try {
			Path path = FileSystems.getDefault().getPath("newFile.txt");
			Files.write(path, "\nLine 5".getBytes(), StandardOpenOption.APPEND);

			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
