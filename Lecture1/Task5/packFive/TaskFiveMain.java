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
		Set picked = new HashSet();
		while (!mask.equals(answer)) {
			System.out.println();
			System.out.println(String.format("Make your guess: %s. You can enter a letter or a word.",mask));
			Scanner input = new Scanner(System.in);
			String guess = input.nextLine().toUpperCase();
			int caseId = 0;
			if (picked.contains(guess)) {
				caseId = 3;
			} else {
				if (guess.length()==1) {
					for (int i = 0; i < answerArray.length; i++) {
						if (answerArray[i]==guess.charAt(0)) {
							caseId = 1;
							guessed.replace(i,i+1,answer.substring(i,i+1));
							mask = guessed.toString();
						} else if (mask.equals(answer)) {
							caseId = 2;
						}
					}
				} else {
					if (answer.toUpperCase().contains(guess)) {
						caseId = 1;
						int startIndex = answer.toUpperCase().indexOf(guess);
						guessed.replace(startIndex,startIndex+guess.length(),
							answer.substring(startIndex,startIndex+guess.length()));
						mask = guessed.toString();
					} else if (mask.equals(answer)) {
						caseId = 2;
					}
				}
			}
			switch (caseId) {
				case 1:
					picked.add(guess);
					System.out.println(String.format("Good guess: %s belongs to %s!",guess,guessed));
					break;
				case 2:
					System.out.println();
					System.out.println(String.format("You win! Correct answer is: %s",answer));
					break;
				case 3:
					picked.add(guess);
					System.out.println(String.format("You've already picked letter %s! Try something different.",guess));
					break;
				default:
					picked.add(guess);
					System.out.println(String.format("Bad guess: %s doesn't belong to %s!",guess,guessed));
					break;
			}
		}
	}
}
