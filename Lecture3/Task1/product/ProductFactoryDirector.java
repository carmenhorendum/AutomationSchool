package product;

import builder.AcousticGuitarBuilder;
import builder.ElectricGuitarBuilder;
import builder.Guitar;
import builder.GuitarBuilderDirector;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductFactoryDirector {

    public static List<Guitar> createGuitars() {
        List<Guitar> guitars = new ArrayList<>();
        GuitarBuilderDirector builderDirector = new GuitarBuilderDirector();
        if (guitars.size() == 0) {
            for (int i = 0; i < RandomUtils.getAmount(); i++) {
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
        }
        return guitars;
    }
}
