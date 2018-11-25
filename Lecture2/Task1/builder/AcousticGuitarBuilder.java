package builder;

import product.Brand;

public class AcousticGuitarBuilder extends GuitarBuilder {
	AcousticGuitar acousticGuitar;

	@Override
	public void buildGuitar() {
		this.acousticGuitar = new AcousticGuitar();
	}

	@Override
	public void addBrand(Brand brand) {
		acousticGuitar.setBrand(brand);
	}

	@Override
	public void addStringsCount(Integer integer) {
		acousticGuitar.setStringsCount(integer);
	}

	public void addSoundhole(String string) {
		acousticGuitar.setSoundhole(string);
	}

	@Override
	public void paint(String string) {
		acousticGuitar.setColor(string);
	}

	@Override
	public Guitar getGuitar() {
		return this.acousticGuitar;
	}
}
