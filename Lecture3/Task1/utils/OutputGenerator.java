package utils;

import product.Product;

import java.io.PrintWriter;

public class OutputGenerator {
	public static void createProducts(Product product, PrintWriter productOutput) {
//		String productInfo = product.firstName + " " + product.lastName + " ";
		String productInfo = product.getGuitar().toString();
		productInfo += Double.toString(product.getPrice());
		productOutput.println(productInfo);
	}
}
