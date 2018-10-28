package com.dh.calc;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		int a,b,sum,dif,mlt,div;
		String aa,bb;
		String op = "run";
		String regex = "-?[0-9]\\d*(\\.\\d+)?";

//// positive test cases, should all be "true"
//		System.out.println("-1".matches(regex));
//		System.out.println("12345".matches(regex));
//		System.out.println("123456789".matches(regex));
//
//// negative test cases, should all be "false"
//		System.out.println("".matches(regex));
//		System.out.println("foo".matches(regex));
//		System.out.println("aa123bb".matches(regex));

		while (!op.equals("quit")) {

			Scanner input = new Scanner(System.in);

			System.out.println("======================");
			System.out.println("> Type '+' to Add");
			System.out.println("> Type '-' to Subtract");
			System.out.println("> Type '*' to Multiply");
			System.out.println("> Type '/' to Divide");
			System.out.println("> Type 'quit' to Exit");
			System.out.println("======================");

//			char op = (char) System.in.read();
			op = input.next();

			if (!(op.equals("quit") || op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {

				System.out.println("Invalid operation!");

			} else if (op.equals("+")) {

				System.out.print("First number:" + " ");
//				a = input.nextInt();
//				aa = String.valueOf(a);
				aa = input.next();

				if (!aa.matches(regex)) {

					System.out.println("Invalid number!");
//					System.out.println(aa);

				} else {

					a = Integer.parseInt(aa);
//					System.out.println(a);

					System.out.print("Second number:" + " ");
					bb = input.next();

					if (!bb.matches(regex)) {

						System.out.println("Invalid number!");
//						System.out.println(bb);

					} else {

						b = Integer.parseInt(bb);
//						System.out.println(b);

						sum = a+b;
						System.out.println("----------------------");
						System.out.println("Add Total:" + " " + sum);

					}

				}

			} else if (op.equals("-")) {

				System.out.print("First number:" + " ");
				aa = input.next();

				if (!aa.matches(regex)) {

					System.out.println("Invalid number!");

				} else {

					a = Integer.parseInt(aa);

					System.out.print("Second number:" + " ");
					bb = input.next();

					if (!bb.matches(regex)) {

						System.out.println("Invalid number!");

					} else {

						b = Integer.parseInt(bb);

						dif = a-b;
						System.out.println("----------------------");
						System.out.println("Subtract Total:" + " " + dif);

					}

				}

			} else if (op.equals("*")) {

				System.out.print("First number:" + " ");
				aa = input.next();

				if (!aa.matches(regex)) {

					System.out.println("Invalid number!");

				} else {

					a = Integer.parseInt(aa);

					System.out.print("Second number:" + " ");
					bb = input.next();

					if (!bb.matches(regex)) {

						System.out.println("Invalid number!");

					} else {

						b = Integer.parseInt(bb);

						mlt = a*b;
						System.out.println("----------------------");
						System.out.println("Multiply Total:" + " " + mlt);

					}

				}

			} else if (op.equals("/")) {

				System.out.print("First number:" + " ");
				aa = input.next();

				if (!aa.matches(regex)) {

					System.out.println("Invalid number!");

				} else {

					a = Integer.parseInt(aa);

					System.out.print("Second number:" + " ");
					bb = input.next();

					if (!bb.matches(regex)) {

						System.out.println("Invalid number!");

					} else {

						b = Integer.parseInt(bb);

						if (b == 0) {

							System.out.println("Error: Can't divide by zero!");

						} else {

							div = a/b;
							System.out.println("----------------------");
							System.out.println("Divide Total:" + " " + div);

						}

					}

				}
			}
		}
	}
}
