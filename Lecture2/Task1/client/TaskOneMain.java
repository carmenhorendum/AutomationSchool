package client;

import product.Filter;
import product.Product;
import product.StockManager;

import java.util.List;

public class TaskOneMain {
	public static void main(String[] args) {
		List<Product> newStock = StockManager.getProductsToStock();
		System.out.println(newStock);
		System.out.println(newStock.size());
		System.out.println(Filter.getStockPrice(newStock));
		System.out.println(Filter.getSortByPrice(newStock));
		System.out.println(Filter.getSortByStringsCount(newStock));
		System.out.println(Filter.getProductByParameters(newStock));
	}
}
