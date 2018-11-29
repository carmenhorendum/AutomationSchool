package utils;

import product.Product;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class IOFileWriter {

	private static final String PATH_NAME = "Task1/consignment.txt";

	public static void storeProductsInFile(Set<Product> products) {
		try {
			File listOfProducts = new File(PATH_NAME);
			PrintWriter productOutput = new PrintWriter(listOfProducts);
			for (Product product : products) {
				String productInfo = String.format("%s - Price: %s",
						product.getGuitar().toString(), Double.toString(product.getPrice()));
				productOutput.println(productInfo);
			}
			productOutput.close();
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
