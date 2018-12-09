public class App {
	private static final Validator VALIDATOR = new Validator();
	public static void main(String[] args) {
		Operator operator = Operator.RUN;
		while (!operator.equals(Operator.QUIT)) {
			System.out.println("Enter simple expression in 'number-operator-number' format, e.g. '2 plus 2'.");
			System.out.println("=======Operator=======");
			System.out.println("> Type 'plus' to Add");
			System.out.println("> Type 'minus' to Subtract");
			System.out.println("> Type 'multiply' to Multiply");
			System.out.println("> Type 'divide' to Divide");
			System.out.println("> Type 'quit' to Exit");
			System.out.println("======================");
			System.out.print("First number:" + " ");
			double newOperand1 = VALIDATOR.getNumbers();
			System.out.println("Operator:" + " ");
			operator = VALIDATOR.getOperator();
			System.out.print("Second number:" + " ");
			double newOperand2 = VALIDATOR.getNumbers();
			Calculator newCalculator = new Calculator(newOperand1, operator, newOperand2);
			System.out.println("Total: " + newCalculator.makeCalculation());
		}
	}
}
