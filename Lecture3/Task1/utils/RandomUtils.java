package utils;

import product.Type;

import java.util.Random;

public class RandomUtils {

    private static final Type[] VALUES = Type.values();
    private static final int SIZE = VALUES.length;
    private static final int COUNT = 10;
    private static final Random RANDOM = new Random();

    public static int getAmount() {
        return RANDOM.nextInt(COUNT);
    }

    public static Type getType() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
