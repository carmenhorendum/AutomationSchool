package packFive;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskFiveMain {
	public static void main(String[] args) {
		String answer = "ДЗЯНІС ГОЛІН";
		String mask = "****** *****";
		char[] answerArray = answer.toUpperCase().toCharArray();
		StringBuffer guessed = new StringBuffer(mask);
		Set<String> picked = new HashSet();
		while (!mask.equals(answer)) {
			System.out.println();
			System.out.println(String.format("\nMake your guess: %s. You can enter a letter or a word.", mask));
			Scanner input = new Scanner(System.in);
			String guess = input.nextLine().toUpperCase();
			if (picked.contains(guess)) {
				printRepeated(picked, guess);
			} else {
				if (guess.length() == 1) {
					boolean flag = false;
					for (int i = 0; i < answerArray.length; i++) {
						if (answerArray[i] == guess.charAt(0)) {
							guessed.replace(i, i + 1, answer.substring(i, i + 1));
							mask = guessed.toString();
							flag = true;
						}
					}
					if (flag == false) {
						printBadGuess(picked, guess, guessed);
					} else {
						printGoodGuess(picked, guess, guessed);
					}
				} else {
					if (answer.toUpperCase().contains(guess)) {
						int startIndex = answer.toUpperCase().indexOf(guess);
						guessed.replace(startIndex,startIndex + guess.length(),
								answer.substring(startIndex, startIndex + guess.length()));
						mask = guessed.toString();
						printGoodGuess(picked, guess, guessed);
					} else {
						printBadGuess(picked, guess, guessed);
					}
				}
			}
		}
		printWin(answer);
	}

	private static void printBadGuess(Set picked, String guess, StringBuffer guessed) {
		picked.add(guess);
		System.out.println(String.format("Bad guess: %s doesn't belong to %s!", guess, guessed));
	}

	private static void printGoodGuess(Set picked, String guess, StringBuffer guessed) {
		picked.add(guess);
		System.out.println(String.format("Good guess: %s belongs to %s!", guess, guessed));
	}

	private static void printRepeated(Set picked, String guess) {
		picked.add(guess);
		System.out.println(String.format("You've already picked %s! Try something different.", guess));
	}

	private static void printWin(String answer) {
		System.out.println(String.format("\nYou win! Correct answer is: %s", answer));
	}
}
