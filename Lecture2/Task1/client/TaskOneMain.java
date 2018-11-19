package client;

import product.Filter;
import product.Product;
import product.StockManager;

import java.util.ArrayList;
import java.util.List;

public class TaskOneMain {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		List<Product> newStock = StockManager.getProductsToStock(products);
		System.out.println(newStock);
		System.out.println(newStock.size());
		System.out.println(Filter.getStockPrice(newStock));
		System.out.println(Filter.getSortByPrice(newStock));
		System.out.println(Filter.getSortByStringsCount(newStock));
		System.out.println(Filter.getProductByParameters(newStock));
	}
}
