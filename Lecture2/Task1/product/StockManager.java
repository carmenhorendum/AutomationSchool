package product;

import builder.Guitar;
import builder.GuitarBuilder;
import builder.GuitarBuilderDirector;

import java.util.ArrayList;
import java.util.List;

public class StockManager {

	public static List<Product> getGuitarsToStock(List<Product> products) {
		List<Guitar> guitars = new ArrayList<>();
		GuitarBuilderDirector builderDirector = new GuitarBuilderDirector();
		if (guitars.size() == 0) {
			guitars.add(builderDirector.buildBassGuitar(new GuitarBuilder()));
			guitars.add(builderDirector.buildElectricGuitar(new GuitarBuilder()));
			guitars.add(builderDirector.buildSemiAcousticGuitar(new GuitarBuilder()));
		}
		for (Guitar guitar : guitars) {
			Product pr = new Product(guitar);
			if (guitar.getBrand().equals(Brand.FENDER)) {
				pr.setPrice(1200);
				pr.setWarranty(24);
			} else if (guitar.getBrand().equals(Brand.GIBSON)) {
				pr.setPrice(2300);
				pr.setWarranty(36);
			} else {
				pr.setPrice(749.99);
				pr.setWarranty(12);
			}
			products.add(pr);
		}

		return products;
	}
}
