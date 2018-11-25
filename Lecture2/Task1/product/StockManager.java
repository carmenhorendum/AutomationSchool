package product;

import java.util.ArrayList;
import java.util.List;

public class StockManager {

	public static List<Product> getProductsToStock() {
		List<Product> products = new ArrayList<>();
		for (int i = 0; i < Type.values().length; i++) {
			ProductFactory.createProducts(products, RandomUtils.getAmount(), Type.ELECTRIC_GUITAR);
			ProductFactory.createProducts(products, RandomUtils.getAmount(), Type.ELECTRIC_BASS);
			ProductFactory.createProducts(products, RandomUtils.getAmount(), Type.JAZZ_GUITAR);
			ProductFactory.createProducts(products, RandomUtils.getAmount(), Type.CLASSICAL_GUITAR);
		}
		return products;
	}
}
