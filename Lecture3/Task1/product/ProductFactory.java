package product;

import builder.Guitar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductFactory {

	public static Set<Product> createProducts(Stock stock, Brand brand, int amount) {
		Set<Product> products = new HashSet<>();
//		try {
		List<Guitar> guitars = stock.getGuitars();
		for (Guitar guitar : guitars) {
			if (guitar.getBrand() == brand) {
				while (products.size() < amount) {
					Product pr = new Product(guitar);
					products.add(pr);
					switch (brand) {
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
				}
			}
		}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		for (Product product : products) {
			guitars.remove(product.getGuitar());
		}
		return products;
	}
}
