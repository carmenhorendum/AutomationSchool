package packOne;

import java.util.Scanner;

public class TaskOneMain {
	public static void main(String[] args) {
		System.out.println("Type in any sentence: ");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().trim();
		String newString = string;
		String search = " ";
		String result;
		int i;
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println();
		System.out.println("Original: "+ string);
		System.out.println();
		System.out.println("Reversed: "+stringBuffer.reverse());
		System.out.println();
		System.out.println("One line - one word: ");
		do {
			i = newString.indexOf(search);
			if (i != -1){
				result = newString.substring(0,i);
				System.out.println(result);
				newString = newString.substring(i + search.length());
			}
		} while (i != -1);
		System.out.println(newString);
		System.out.println();
		System.out.println("Spaces to Asterisks: "+ string.replace(' ', '*'));
		System.out.println();
		System.out.println("To Upper Case: "+ string.toUpperCase());
		System.out.println();
		System.out.println("Substring 5 to 10 (included): "+ string.substring(4,10));
	}
}
