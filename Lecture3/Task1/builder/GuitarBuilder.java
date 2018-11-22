package builder;

import product.Brand;

public abstract class GuitarBuilder {
	Guitar guitar;

	public void buildGuitar() {
	}

	public void addBrand(Brand brand) {
		guitar.setBrand(brand);
	}

	public void addStringsCount(Integer integer) {
		guitar.setStringsCount(integer);
	}

	public void paint(String string) {
		try {
			guitar.setColor(string);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Guitar getGuitar() {
		return this.guitar;
	}
}