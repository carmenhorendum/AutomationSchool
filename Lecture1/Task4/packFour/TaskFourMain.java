package packFour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskFourMain {
	public static void main(String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] timeValues = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		List<Runner> runners = new ArrayList<>();
		for (int i = 0; i < timeValues.length; i++) {
			runners.add(new Runner(names[i],timeValues[i]));
		}
		runners.sort(Comparator.comparingInt(Runner::getTime));
		System.out.println();
		for (int i = 0; i < runners.size(); i++) {
			runners.get(i).setPlace(i+1);
			System.out.println(String.format("Name: %s, Time: %d, Place: %d",runners.get(i).getName(),runners.get(i).getTime(),runners.get(i).getPlace()));
		}
		System.out.println();
		System.out.println("Enter runner place to get info:");
		Scanner input = new Scanner(System.in);
		int anyPlace = input.nextInt();
		int index = anyPlace-1;
		System.out.println(String.format("Place %d",anyPlace));
		System.out.println(String.format("Name: %s, Time: %d",runners.get(index).getName(),runners.get(index).getTime()));
	}
}
