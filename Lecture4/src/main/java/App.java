public class App {
	public static void main(String[] args) {
		Operator newOperator = Operator.RUN;
		while (!newOperator.equals(Operator.QUIT)) {
			System.out.println("Enter simple expression in 'number-operator-number' format, e.g. '2 plus 2'.");
			System.out.println("=======Operator=======");
			System.out.println("> Type 'plus' to Add");
			System.out.println("> Type 'minus' to Subtract");
			System.out.println("> Type 'multiply' to Multiply");
			System.out.println("> Type 'divide' to Divide");
			System.out.println("> Type 'quit' to Exit");
			System.out.println("======================");
			Validator validator = new Validator();
			System.out.print("First number:" + " ");
			validator.isNumber();
			System.out.println("Operator:" + " ");
			validator.isOperator();
			newOperator = validator.getOperator();
			double newOperand1 = validator.getOperand();
			System.out.print("Second number:" + " ");
			validator.isNumber();
			double newOperand2 = validator.getOperand();
			Calculator newCalculator = new Calculator(newOperand1, newOperator, newOperand2);
			System.out.println("Total: " + newCalculator.makeCalculation());
		}
	}
}
