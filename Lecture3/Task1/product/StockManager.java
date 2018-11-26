package product;

import builder.Guitar;
import exceptions.FailedOrderException;

import java.util.List;

public class StockManager {

	private static List<Guitar> guitars;

	public static List<Guitar> initStock() throws FailedOrderException {
		guitars = GuitarFactory.createGuitars();
		return guitars;
	}

	public static List<Product> initProducts() {
		return ProductFactory.createProducts();
	}

	public List<Product> getConsignment() {
		return Stock.getProducts();
	}
}
