import java.util.*;

public class TaskFourMain {
	public static void main(String[] args) {
		final int COLLECTION_SIZE = 10000000;
		final int CHANGES_SIZE = 1000;
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		Random random = new Random();
		for (int i = 0; i < COLLECTION_SIZE; i++) {
			arrayList.add(random.nextInt(10));
			linkedList.add(random.nextInt(10));
		}

		System.out.println(String.format("Array list add %d, time: %d",
				CHANGES_SIZE, getAddElementTime(CHANGES_SIZE, arrayList)));
		System.out.println(String.format("Linked list add %d, time: %d",
				CHANGES_SIZE, getAddElementTime(CHANGES_SIZE, linkedList)));

		System.out.println(String.format("Array list delete %d, time: %d",
				CHANGES_SIZE, getDeleteElementTime(CHANGES_SIZE, arrayList)));
		System.out.println(String.format("Linked list delete %d, time: %d",
				CHANGES_SIZE, getDeleteElementTime(CHANGES_SIZE, linkedList)));

		System.out.println(String.format("Array list find %d, time: %d",
				CHANGES_SIZE, getFindElementTime(CHANGES_SIZE, arrayList)));
		System.out.println(String.format("Linked list find %d, time: %d",
				CHANGES_SIZE, getFindElementTime(CHANGES_SIZE, linkedList)));
	}

	private static long getAddElementTime(int CHANGES_SIZE, List<Integer> list) {
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < CHANGES_SIZE; i++) {
			list.add(random.nextInt(10));
		}
		return System.currentTimeMillis() - startTime;
	}

	private static long getDeleteElementTime(int CHANGE_SIZE, List<Integer> list) {
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < CHANGE_SIZE; i++) {
			list.remove(random.nextInt(10));
		}
		return System.currentTimeMillis() - startTime;
	}

	private static long getFindElementTime(int CHANGE_SIZE, List<Integer> list) {
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for (int i = 0; i < CHANGE_SIZE; i++) {
			list.indexOf(random.nextInt(10));
		}
		return System.currentTimeMillis() - startTime;
	}
}
