package product;

import java.util.List;
import java.util.Random;

public class StockManager {

	private enum Types {
		ELECTRIC_GUITAR,
		ELECTRIC_BASS,
		JAZZ_GUITAR,
		CLASSICAL_GUITAR
	}

	public static List<Product> getProductsToStock(List<Product> products) {
		for (int i = 0; i < Types.values().length; i++) {
			System.out.println(Types.values().length);
			Random random = new Random();
			int amount = random.nextInt(5);
			products = ProductFactory.createProducts(products, amount, Types.ELECTRIC_GUITAR.toString());
			amount = random.nextInt(5);
			products = ProductFactory.createProducts(products, amount, Types.ELECTRIC_BASS.toString());
			amount = random.nextInt(5);
			products = ProductFactory.createProducts(products, amount, Types.JAZZ_GUITAR.toString());
			amount = random.nextInt(5);
			products = ProductFactory.createProducts(products, amount, Types.CLASSICAL_GUITAR.toString());
		}
		return products;
	}
}
