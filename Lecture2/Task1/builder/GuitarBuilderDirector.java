package builder;

import product.Brand;

public class GuitarBuilderDirector {
	public Guitar buildElectricGuitar(GuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(6);
		builder.paint("blue");
		builder.addBrand(Brand.IBANEZ);

		return builder.getGuitar();
	}

	public Guitar buildSemiAcousticGuitar(GuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(7);
		builder.paint("honey");
		builder.addBrand(Brand.GIBSON);

		return builder.getGuitar();
	}

	public Guitar buildBassGuitar(GuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(4);
		builder.paint("red");
		builder.addBrand(Brand.FENDER);

		return builder.getGuitar();
	}
}
