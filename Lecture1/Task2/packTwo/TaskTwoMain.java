package packTwo;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class TaskTwoMain {
	public static void main(String[] args) {
		String dayNames[] = new DateFormatSymbols().getWeekdays();
		System.out.println("Enter weekday number (1-7):");
		Scanner input = new Scanner(System.in);
		int dayNumber = Integer.parseInt(input.next());
		System.out.println(String.format("Your day number is %d - %s.", dayNumber, dayNames[dayNumber]));
	}
}
