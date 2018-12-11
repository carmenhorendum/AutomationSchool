package utils;

import product.Brand;
import product.Type;

import java.util.Random;

public class RandomUtils {

    private static final Type[] TYPES = Type.values();
    private static final Brand[] BRANDS = Brand.values();
    private static final int TYPES_SIZE = TYPES.length;
    private static final int BRANDS_SIZE = BRANDS.length;
    private static final int COUNT = 10;
    private static final Random RANDOM = new Random();

    public static int getAmount() {
        return RANDOM.nextInt(COUNT);
    }

    public static Type getType() {
        return TYPES[RANDOM.nextInt(TYPES_SIZE)];
    }

    public static Brand getBrand() {
        return BRANDS[RANDOM.nextInt(BRANDS_SIZE)];
    }
}
