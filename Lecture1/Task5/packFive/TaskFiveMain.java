package packFive;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskFiveMain {
	public static void main(String[] args) {
		String answer = "Дзяніс Голін";
		String mask = "****** *****";
		char[] answerArray = answer.toLowerCase().toCharArray();
		StringBuffer guessed = new StringBuffer(mask);
		Set picked = new HashSet();
		while (!mask.equals(answer)) {
			System.out.println("Make your guess. You can enter a letter or a word:");
			Scanner input = new Scanner(System.in);
			String guess = input.nextLine().toLowerCase().trim();
			int caseId = 0;
			if (picked.contains(guess)) {
				caseId = 3;
			} else {
//				if (guess.length()==1) {
					for (int i = 0; i < answerArray.length; i++) {
						System.out.println(answerArray[i]);
						System.out.println(guess.charAt(0));
						System.out.println();
						if (answerArray[i]==guess.charAt(0)) {
							caseId = 1;
							guessed.replace(i,i+1,answer.substring(i,i+1));
							mask = guessed.toString();
						} else {
							caseId = 2;
						}
					}
//				} else {
//					System.out.println(guess.length());
//				}
			}
			System.out.println(caseId);
			switch (caseId) {
				case 1:
					picked.add(guess);
					System.out.println(String.format("Success! %s",guessed));
					break;
				case 2:
					picked.add(guess);
					System.out.println(String.format("Wrong guess! %s doesn't belong to %s.",guess,guessed));
					break;
				case 3:
					picked.add(guess);
					System.out.println(String.format("You've already picked letter %s! Try another one.",guess));
					break;
				default:
					mask = guessed.toString();
					System.out.println();
					System.out.println(String.format("You win! Correct answer is: %s",answer));
					break;
			}
//			System.out.println(picked);
//			System.out.println(picked.contains(guess));
//			mask = guessed.toString();
//			System.out.println();
//			System.out.println(String.format("You win! Correct answer is: %s",answer));
		}
	}
}
