package utils;

import java.io.*;

public class IOFileWriter {
	public static PrintWriter createFile(String fileName) {
		try {
			File listOfNames = new File(fileName);
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
			return infoToWrite;
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		}
		return null;
	}
}
