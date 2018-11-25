package builder;

import product.Brand;

public class GuitarBuilderDirector {
	public ElectricGuitar buildElectricGuitar(ElectricGuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(6);
		builder.addPickup("Lace Alumitone");
		builder.paint("blue");
		builder.addBrand(Brand.IBANEZ);

		return (ElectricGuitar) builder.getGuitar();
	}

	public ElectricGuitar buildSemiAcousticGuitar(ElectricGuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(7);
		builder.addPickup("Gibson P-90");
		builder.paint("honey");
		builder.addBrand(Brand.GIBSON);

		return (ElectricGuitar) builder.getGuitar();
	}

	public ElectricGuitar buildBassGuitar(ElectricGuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(4);
		builder.addPickup("Fender J-style");
		builder.paint("red");
		builder.addBrand(Brand.FENDER);

		return (ElectricGuitar) builder.getGuitar();
	}

	public AcousticGuitar buildClassicalGuitar(AcousticGuitarBuilder builder) {

		builder.buildGuitar();
		builder.addStringsCount(6);
		builder.addSoundhole("Classical circle");
		builder.paint("natural wood");
		builder.addBrand(Brand.FERNANDES);

		return (AcousticGuitar) builder.getGuitar();
	}
}
