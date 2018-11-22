package utils;

import java.io.*;

public class IOFileWriter {
	public static PrintWriter createFile(String fileName) {
		try {
			File listOfNames = new File(fileName);
			return new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		}
		return null;
	}
}
