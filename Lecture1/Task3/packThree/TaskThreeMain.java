package packThree;

import java.util.Scanner;

public class TaskThreeMain {
	public static void main(String[] args) {
		int middleStarCount;
//		int lines;
//		int length;
//		int i;
		String space = " ";
		String asterisk = "*";
		System.out.println("Enter size:");
		Scanner input = new Scanner(System.in);
		middleStarCount = Integer.parseInt(input.next());
//		lines = size+1;
//		System.out.println(lines);
//		String lineOne = space.concat(asterisk);
//		String lineTwo = asterisk.concat(lineOne);
//		System.out.println(lineOne);
//		System.out.println(lineTwo);
//		System.out.println(lineOne);
//
//		length = size+lines;
//		System.out.println(length);

		StringBuilder result = new StringBuilder();
		StringBuilder bottom = new StringBuilder();
		StringBuilder middle = new StringBuilder();
		StringBuilder top = new StringBuilder();
		for (int i = 0; i < middleStarCount; i++) {
			top.append(asterisk);
//			System.out.println("i="+i);
			System.out.println(top);
		}

//		System.out.println(result.reverse());
//		top.append(asterisk);
//		for (int i = 0; i < middleStarCount - 1; i++) {
//			top.delete(0,i);
//		}
//		System.out.println(top);
//		bottom.append(asterisk);
//		System.out.println(bottom);
//		for (int i = middleStarCount - 1; i > middleStarCount / 2 ; i-- ){
//			int offset = middleStarCount - i;
//			for (int j = 0; j < middleStarCount; j++) {
//				bottom.append(j < offset || (i - j) * offset < offset ? " " : "*");
//			}
//			bottom.append("\n");
//			System.out.println(bottom);
//		}
//		result.append(bottom.reverse().append("\n")).append(middle).append(bottom.reverse());
//		return result.toString();
//		System.out.println(result);
	}
}
