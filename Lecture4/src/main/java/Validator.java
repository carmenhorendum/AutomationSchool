import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private double operand;
	private Operator operator;
	private static Scanner input = new Scanner(System.in);
	private static final Pattern NUMBER_PATTERN = Pattern.compile("-?[0-9]\\d*(\\.\\d+)?");

	public double getOperand() {
		return operand;
	}

	public Operator getOperator() {
		return operator;
	}

	public boolean isNumber() {
		try {
			operand = input.nextDouble();
			Matcher matchNumber = NUMBER_PATTERN.matcher(String.valueOf(operand));
			if (matchNumber.find()) {
				System.out.println(operand);
			}
			return true;
		} catch (InputMismatchException e) {
			System.out.println(e + " Invalid number!");
			return false;
		}

//		} catch (NumberFormatException e) {
//			System.out.println(e + " Invalid number!");
//			return false;
//		}
	}

	public boolean isOperator() {
		try {
			operator = Operator.valueOf(input.next().toUpperCase());
			if (operator.equals(Operator.QUIT)) {
				System.out.println(operator);
				System.exit(0);
			} else if (operator.equals(Operator.PLUS)
					|| operator.equals(Operator.MINUS)
					|| operator.equals(Operator.MULTIPLY)
					|| operator.equals(Operator.DIVIDE)) {
				System.out.println(operator);
			}
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid operation!");
			System.exit(0);
			return false;
		}
	}
}
