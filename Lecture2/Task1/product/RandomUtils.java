package product;

import java.util.Random;

public class RandomUtils {

	public static int getAmount() {
		Random random = new Random();
		return random.nextInt(5);
	}
}
