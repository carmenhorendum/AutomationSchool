package packOne;

import java.util.Scanner;

public class TaskOneMain {
	public static void main(String[] args) {
		System.out.println("Type in any sentence: ");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().trim();
		printEmptyLine();
		printOriginal(string);
		printEmptyLine();
		doReversed(string);
		printEmptyLine();
		doSplitString(string);
		printEmptyLine();
		doReplaceSpaces(string);
		printEmptyLine();
		doAllCaps(string);
		printEmptyLine();
		doSubstring(string);
	}

	private static void printEmptyLine() {
		System.out.println();
	}

	private static void printOriginal(String string) {
		System.out.println(String.format("Original: %s", string));
	}

	private static void doReversed(String string) {
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println(String.format("Reversed: %s", stringBuffer.reverse()));
	}

	private static void doSplitString(String string) {
		String[] parts = string.split(" ", -5);
		System.out.println("One line - one word: ");
		for (String out : parts)
		System.out.println(out);
	}

	private static void doReplaceSpaces(String string) {
		System.out.println(String.format("Spaces to Asterisks: %s", string.replace(' ', '*')));
	}

	private static void doAllCaps(String string) {
		System.out.println(String.format("To Upper Case: %s", string.toUpperCase()));
	}

	private static void doSubstring(String string) {
		System.out.println(String.format("Substring 5 to 10 (included): %s", string.substring(4,10)));
	}
}
