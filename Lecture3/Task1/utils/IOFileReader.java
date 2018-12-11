package utils;

import exceptions.EmptyFileException;
import exceptions.NoMatchException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOFileReader {

	private static final Pattern GTR_OBJECT_PATTERN = Pattern.compile("\\{([\\w\\W)])+}");
	private static final Pattern GTR_BRAND_PATTERN = Pattern.compile("\\w[A-Z]+");
	private static final String PATH_NAME = "Task1/consignment.txt";

	public static List<String> getGuitarsFromFile() {
		File listOfProducts = new File(PATH_NAME);
		List<String> guitars = new ArrayList<>();
		try {
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfProducts));
			String productInfo = getInfo.readLine();
			if (productInfo == null) {
				throw new EmptyFileException("There is no data to read: file is empty");
			} else {
				while (productInfo != null) {
					Matcher matchGtr = GTR_OBJECT_PATTERN.matcher(productInfo);
					if (matchGtr.find()) {
						guitars.add(matchGtr.group(0));
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
			System.out.println(e);
			System.exit(0);
		}
		System.out.println(String.format("%d Guitars Written to File:", guitars.size()));
		return guitars;
	}

	public static Set<String> getBrandsFromFile() {
		File listOfProducts = new File("M://GitHub/products.txt");
		Set<String> brands = new HashSet<>();
		try {
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfProducts));
			String productInfo = getInfo.readLine();
			if (productInfo == null) {
				throw new EmptyFileException("There is no data to read: file is empty");
			} else {
				while (productInfo != null) {
					Matcher matchBrand = GTR_BRAND_PATTERN.matcher(productInfo);
					if (matchBrand.find()) {
						brands.add(matchBrand.group(0));
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
			System.out.println(e);
			System.exit(0);
		}
		System.out.println(String.format("%d Brands Written to File:", brands.size()));
		return brands;
	}
}
