package client;

import product.Filter;
import product.Product;
import product.StockManager;
import utils.IOFileReader;
import utils.IOFileWriter;
import utils.OutputGenerator;

import java.io.PrintWriter;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		List<Product> newStock = StockManager.getProductsToStock();
		System.out.println(newStock);
		System.out.println(newStock.size());
		PrintWriter productOutput = IOFileWriter.createFile("M://GitHub/products.txt");
		for (Product product : newStock) {
			OutputGenerator.createProducts(product, productOutput);
		}
		try {
			productOutput.close();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		IOFileReader.getFileInfo();
		try {
			System.out.println("Order total: $" + Filter.getStockPrice(newStock));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Filter.getSortByPrice(newStock));
		System.out.println(Filter.getSortByStringsCount(newStock));
		System.out.println(Filter.getProductByParameters(newStock));
	}
}
