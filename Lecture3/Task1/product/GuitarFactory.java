package product;

import builder.AcousticGuitarBuilder;
import builder.ElectricGuitarBuilder;
import builder.Guitar;
import builder.GuitarBuilderDirector;
import exceptions.FailedOrderException;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class GuitarFactory {

	public static List<Guitar> createGuitars() throws FailedOrderException {
		List<Guitar> guitars = new ArrayList<>();
		GuitarBuilderDirector builderDirector = new GuitarBuilderDirector();
		int amount = RandomUtils.getAmount();
		if (amount == 0) {
			throw new FailedOrderException("Fail to produce some guitars");
		}
		for (int i = 0; i < amount; i++) {
			switch (RandomUtils.getType()) {
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
		return guitars;
	}
}
