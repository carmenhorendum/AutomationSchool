package product;

import builder.Guitar;
import exceptions.FailedOrderException;

import java.util.List;

public class Stock {
	private static List<Guitar> guitars;
	private static List<Product> products;

	public static List<Guitar> getGuitars() throws FailedOrderException {
		guitars = StockManager.initStock();
		return guitars;
	}

	public static List<Product> getProducts() {
		products = StockManager.initProducts();
		return products;
	}
}
