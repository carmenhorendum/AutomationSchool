package product;

import builder.AcousticGuitarBuilder;
import builder.ElectricGuitarBuilder;
import builder.Guitar;
import builder.GuitarBuilderDirector;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {

	public static List<Product> createProducts(List<Product> products, int amount, Type type) {
		List<Guitar> guitars = new ArrayList<>();
		GuitarBuilderDirector builderDirector = new GuitarBuilderDirector();
		if (guitars.size() == 0) {
			for (int i = 0; i < amount; i++) {
				switch (type) {
					case ELECTRIC_BASS:
						guitars.add(builderDirector.buildBassGuitar(new ElectricGuitarBuilder()));
						break;
					case ELECTRIC_GUITAR:
						guitars.add(builderDirector.buildElectricGuitar(new ElectricGuitarBuilder()));
						break;
					case JAZZ_GUITAR:
						guitars.add(builderDirector.buildSemiAcousticGuitar(new ElectricGuitarBuilder()));
						break;
					case CLASSICAL_GUITAR:
						guitars.add(builderDirector.buildClassicalGuitar(new AcousticGuitarBuilder()));
						break;
					default:
						break;
				}
			}
		}
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
		return products;
	}
}
