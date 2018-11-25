package builder;

import product.Brand;

public class ElectricGuitarBuilder extends GuitarBuilder {
	ElectricGuitar electricGuitar;

	@Override
	public void buildGuitar() {
		this.electricGuitar = new ElectricGuitar();
	}

	@Override
	public void addBrand(Brand brand) {
		electricGuitar.setBrand(brand);
	}

	@Override
	public void addStringsCount(Integer integer) {
		electricGuitar.setStringsCount(integer);
	}

	@Override
	public void paint(String string) {
		electricGuitar.setColor(string);
	}

	public void addPickup(String string) {
		electricGuitar.setPickup(string);
	}

	@Override
	public Guitar getGuitar() {
		return this.electricGuitar;
	}
}
