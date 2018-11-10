package packTwo;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class TaskTwoMain {
	public static void main(String[] args) {
		getDayNameFromNumber();
	}
	
	private static void getDayNameFromNumber() {
		String dayNames[] = new DateFormatSymbols().getWeekdays();
		int dayNumber;
		do {
			System.out.println("Enter weekday number (1-7):");
			Scanner input = new Scanner(System.in);
			dayNumber = input.nextInt();
		} while (dayNumber <= 0 || dayNumber > 7);
		System.out.println(String.format("Your day number is %d - %s.", dayNumber, dayNames[dayNumber]));
	}	
}
