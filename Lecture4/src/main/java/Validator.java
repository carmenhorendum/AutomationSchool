import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private double operand;
	private Operator operator;
	private static final Reader READER = new Reader();
	private static final Pattern NUMBER_PATTERN = Pattern.compile("-?[0-9]\\d*(\\.\\d+)?");

	public double getNumbers() {
		try {
			operand = READER.readOperand();
			Matcher matchNumber = NUMBER_PATTERN.matcher(String.valueOf(operand));
			if (matchNumber.find()) {
				System.out.println(operand);
			}
			return operand;
		} catch (InputMismatchException e) {
			System.out.println(e + " Invalid number!");
			return 0;
		}
	}

	public Operator getOperator() {
		try {
			operator = READER.readOperator();
			if (operator.equals(Operator.QUIT)) {
				System.out.println(operator);
				System.exit(0);
			} else if (operator.equals(Operator.PLUS)
					|| operator.equals(Operator.MINUS)
					|| operator.equals(Operator.MULTIPLY)
					|| operator.equals(Operator.DIVIDE)) {
				System.out.println(operator);
			}
			return operator;
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid operation!");
			System.exit(0);
			return null;
		}
	}
}
