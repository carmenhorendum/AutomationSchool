package product;

import builder.AcousticGuitarBuilder;
import builder.ElectricGuitarBuilder;
import builder.Guitar;
import builder.GuitarBuilderDirector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuitarFactory {

	public static List<Guitar> createGuitars(int amount) {
		List<Guitar> guitars = new ArrayList<>();
		GuitarBuilderDirector builderDirector = new GuitarBuilderDirector();
		for (int i = 0; i < amount; i++) {
			Arrays.stream(Type.values()).forEach(type -> {
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
			});
		}
		return guitars;
	}
}
