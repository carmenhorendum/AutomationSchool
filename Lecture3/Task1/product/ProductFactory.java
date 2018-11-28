package product;

import builder.Guitar;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

	public static List<Product> createProducts(Stock stock, Type type, int amount) {
		List<Product> products = new ArrayList<>();
		try {
			List<Guitar> guitars = stock.getGuitars();
			for (Guitar guitar : guitars) {
				Product pr = new Product(guitar);
				switch (guitar.getBrand()) {
					case FENDER:
						pr.setPrice(1200);
						pr.setWarranty(24);
						break;
					case GIBSON:
						pr.setPrice(2300);
						pr.setWarranty(36);
						break;
					case IBANEZ:
						pr.setPrice(749.99);
						pr.setWarranty(12);
						break;
					case FERNANDES:
						pr.setPrice(1850.50);
						pr.setWarranty(30);
						break;
					default:
						break;
				}
				products.add(pr);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return products;
	}
}
