public class Calculator {
	private Operator operator;
	private double operand1, operand2;

	public Calculator(double operand1, Operator operator, double operand2) {
		this.operand1 = operand1;
		this.operator = operator;
		this.operand2 = operand2;
	}

	public double makeCalculation() {
		double total = 0;
		switch (operator) {
			case PLUS:
				total = operand1 + operand2;
				break;
			case MINUS:
				total = operand1 - operand2;
				break;
			case MULTIPLY:
				total = operand1 * operand2;
				break;
			case DIVIDE:
				total = division();
				break;
			default:
				System.out.println("Invalid operation!");
		}
		return total;
	}

	private double division() {
		if (operand2 == 0) {
			throw new IllegalArgumentException("Error: Can't divide by zero!");
		} else {
			return operand1 / operand2;
		}
	}
}
