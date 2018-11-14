public class GuitarBuilderDirector {
	public Guitar buildElectricGuitar(GuitarBuilder builder){

		builder.buildGuitar();
		builder.addBodyConstruction("Solid");
		builder.addBodyShape("Flying V");
		builder.addBodyWood("Alder");
		builder.addNeckWood("Maple");
		builder.addFretboardWood("Rosewood");
		builder.addNeckJoint("Glued-in");
		builder.addHeadstock("Strat-style");
		builder.addBridgeType("Floyd Rose");
		builder.addPickupsBrand("Lace Alumitone");
		builder.addPickupsType("Passive");
		builder.addFretsCount(24);
		builder.addStringsCount(6);
		for (int i = 0; i < 6; i++)
			builder.addTunersType("Locking");
		builder.paint("blue");

		return builder.getGuitar();
	}

	public Guitar buildSemiAcousticGuitar(GuitarBuilder builder){

		builder.buildGuitar();
		builder.addBodyConstruction("Hollow");
		builder.addBodyShape("LP");
		builder.addBodyWood("Mahogany");
		builder.addNeckWood("Mahogany");
		builder.addFretboardWood("Rosewood");
		builder.addNeckJoint("Glued-in");
		builder.addHeadstock("LP-style");
		builder.addBridgeType("Bigsby");
		builder.addPickupsBrand("Seymour Duncan");
		builder.addPickupsType("Passive");
		builder.addFretsCount(22);
		builder.addStringsCount(7);
		for (int i = 0; i < 6; i++)
			builder.addTunersType("Modern Vintage");
		builder.paint("honey");

		return builder.getGuitar();
	}

	public Guitar buildBassGuitar(GuitarBuilder builder){

		builder.buildGuitar();
		builder.addBodyConstruction("Solid");
		builder.addBodyShape("Jazz Bass");
		builder.addBodyWood("Mahogany");
		builder.addNeckWood("Bubinga");
		builder.addFretboardWood("Ebony");
		builder.addNeckJoint("Neck-Through");
		builder.addBridgeType("Fixed");
		builder.addPickupsBrand("Bartolini");
		builder.addPickupsType("Active");
		builder.addFretsCount(22);
		builder.addStringsCount(4);
		for (int i = 0; i < 4; i++)
			builder.addTunersType("Vintage");
		builder.paint("red");

		return builder.getGuitar();
	}
}
