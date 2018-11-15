package builder;

import product.Brand;

public class GuitarBuilder {
	Guitar guitar;

	public void buildGuitar() {
		this.guitar = new Guitar();
	}

	public void addBrand(Brand brand) {
		guitar.setBrand(brand);
	}

	public void addStringsCount(Integer integer) {
		guitar.setStringsCount(integer);
	}

	public void paint(String string) {
		guitar.setColor(string);
	}

	public Guitar getGuitar() {
		return this.guitar;
	}
}