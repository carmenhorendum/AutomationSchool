package utils;

import exceptions.EmptyFileException;
import exceptions.NoMatchException;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOFileReader {

	private static final Pattern GTR_OBJECT_PATTERN = Pattern.compile("\\{([\\w\\W)])+}");
	private static final Pattern GTR_BRAND_PATTERN = Pattern.compile("\\w[A-Z]+");

	public static void printFileInfo() {
		System.out.println("Info Written to File:");
		File listOfProducts = new File("M://GitHub/products.txt");
		try {
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfProducts));
			String productInfo = getInfo.readLine();
			if (productInfo == null) {
				throw new EmptyFileException ("File is empty");
			} else {
				while (productInfo != null) {
					Matcher matchGtr = GTR_OBJECT_PATTERN.matcher(productInfo);
					if (matchGtr.find()) {
						System.out.println("Guitar object: " + matchGtr.group(0));
					} else {
						throw new NoMatchException("No matches found");
					}
					Matcher matchBrand = GTR_BRAND_PATTERN.matcher(productInfo);
					if (matchBrand.find()) {
						System.out.println("Brand: " + matchBrand.group(0));
					} else {
						throw new NoMatchException("No matches found");
					}
					productInfo = getInfo.readLine();
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		} catch (NoMatchException | EmptyFileException e) {
			e.printStackTrace();
		}
	}
}
