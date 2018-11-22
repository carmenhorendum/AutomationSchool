package utils;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOFileReader {

	public static void getFileInfo() {
		System.out.println("Info Written to File:");
		File listOfProducts = new File("M://GitHub/products.txt");
		try {
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfProducts));
			String productInfo = getInfo.readLine();
			while (productInfo != null) {
				Pattern pattern = Pattern.compile("\\{([\\w\\W)])+}");
				Matcher matcher = pattern.matcher(productInfo);
				if (matcher.find()) {
					System.out.println("Guitar object: " + matcher.group(0));
				}
				pattern = Pattern.compile("\\w[A-Z]+");
				matcher = pattern.matcher(productInfo);
				if (matcher.find()) {
					System.out.println("Brand: " + matcher.group(0));
				}
				productInfo = getInfo.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		}
	}
}
