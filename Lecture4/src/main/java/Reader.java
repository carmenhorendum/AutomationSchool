import java.util.Scanner;

public class Reader {
	private static Scanner input = new Scanner(System.in);

	public double readOperand() {
		return input.nextDouble();
	}

	public Operator readOperator() {
		return Operator.valueOf(input.next().toUpperCase());
	}
}
