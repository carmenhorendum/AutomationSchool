package client;

import product.Filter;
import product.Product;
import product.Stock;
import product.StockManager;
import utils.IOFileReader;
import utils.IOFileWriter;

import java.util.List;

public class Application {
	public static void main(String[] args) {
		Stock stock = new Stock();
		StockManager stockManager = new StockManager(stock);
		stockManager.initStock();
		System.out.println(stock.getGuitars());
//		List<Product> consignment = stockManager.getConsignment();
//		System.out.println(consignment);
//		System.out.println(consignment.size());
//		IOFileWriter.storeProductsInFile(consignment);
//		IOFileReader.printFileInfo();
//		try {
//			System.out.println("Order total: $" + Filter.getStockPrice(consignment));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(Filter.getSortByPrice(consignment));
//		System.out.println(Filter.getSortByStringsCount(consignment));
//		System.out.println(Filter.getProductByParameters(consignment));
	}
}
