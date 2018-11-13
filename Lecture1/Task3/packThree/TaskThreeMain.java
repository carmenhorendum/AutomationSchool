package packThree;

import java.util.Scanner;

public class TaskThreeMain {
	public static void main(String[] args) {
		int side, rows;
		System.out.println("Enter diamond side size:");
		Scanner input = new Scanner(System.in);
		side = Integer.parseInt(input.next());
		rows = (side * 2) - 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (j + i == rows / 2 || i + j == rows - 1 + (rows / 2)
					|| j == i - (rows / 2) || i == j - (rows / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
