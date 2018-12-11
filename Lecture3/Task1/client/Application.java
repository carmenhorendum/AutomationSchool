package client;

import product.*;
import utils.IOFileReader;
import utils.IOFileWriter;

import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Stock stock = new Stock();
		StockManager stockManager = new StockManager(stock);
		stockManager.initStock();
		System.out.println(String.format("%d Guitars in stock", stock.getGuitars().size()));
		Set<Product> consignment = stockManager.getConsignment(Brand.FENDER, 2);
		consignment.addAll(stockManager.getConsignment(Brand.GIBSON, 3));
		System.out.println(String.format("Ready to ship %d items:\n%s", consignment.size(), consignment));
		System.out.println(String.format("%d Guitars left in stock", stock.getGuitars().size()));
		IOFileWriter.storeProductsInFile(consignment);
		System.out.println(IOFileReader.getGuitarsFromFile());
		System.out.println(IOFileReader.getBrandsFromFile());
		try {
			System.out.println("Order total: $" + Filter.getStockPrice(consignment));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Filter.getSortByPrice(consignment));
		System.out.println(Filter.getSortByStringsCount(consignment));
		System.out.println(Filter.getProductByParameters(consignment));
	}
}
