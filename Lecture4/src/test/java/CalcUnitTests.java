import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcUnitTests {
	private double op1;
	private double op2;
	private Operator operator;

	private Calculator newCalc() {
		return new Calculator(op1, operator, op2);
	}

	private double getOperand(double operand) {
		return operand;
	}

	private Operator getOperator(Operator operator) {
		return operator;
	}

	@BeforeClass
	public void oneTimeSetUp() {
		newCalc();
		System.out.print("Before Class: newCalc();");
	}

	@Test(dataProvider = "testAddDataProvider")
	public void add_twoNumbers_returnsSum(double operand1, double operand2, double total) {
		operator = Operator.PLUS;
		op1 = getOperand(operand1);
		op2 = getOperand(operand2);
		System.out.println("Test Total: " + newCalc().makeCalculation());
		Assert.assertEquals(newCalc().makeCalculation(), total);
	}

	@DataProvider(name = "testAddDataProvider")
	public Object[][] parameterAddTestProvider() {
		return new Object[][]{
				{2, 2, 4},
				{1, 0, 1},
				{0, 0, 0},
				{1, -1, 0},
				{-2, -2, -4},
				{2, 22, 24},
				{Double.MAX_VALUE, 1, Double.MAX_VALUE}
		};
	}

	@Test(dataProvider = "testSubDataProvider")
	public void sub_twoNumbers_returnsDif(double operand1, double operand2, double total) {
		operator = Operator.MINUS;
		op1 = getOperand(operand1);
		op2 = getOperand(operand2);
		System.out.println("Test Total: " + newCalc().makeCalculation());
		Assert.assertEquals(newCalc().makeCalculation(), total);
	}

	@DataProvider(name = "testSubDataProvider")
	public Object[][] parameterSubTestProvider() {
		return new Object[][]{
				{2, 2, 0},
				{1, 0, 1},
				{0, 0, 0},
				{0, 1, -1},
				{-2, 2, -4},
				{-2, 22, -24},
				{Double.MIN_VALUE, 1, -1}
		};
	}

	@Test(dataProvider = "testMultDataProvider")
	public void mult_twoNumbers_returnsProd(double operand1, double operand2, double total) {
		operator = Operator.MULTIPLY;
		op1 = getOperand(operand1);
		op2 = getOperand(operand2);
		System.out.println("Test Total: " + newCalc().makeCalculation());
		Assert.assertEquals(newCalc().makeCalculation(), total);
	}

	@DataProvider(name = "testMultDataProvider")
	public Object[][] parameterMultTestProvider() {
		return new Object[][]{
				{2, 2, 4},
				{1, 0, 0},
				{0, 0, 0},
				{0, -1, -0.0},
				{2, -2, -4},
				{2, 22, 44}
		};
	}

	@Test(expectedExceptions = IllegalArgumentException.class,
			expectedExceptionsMessageRegExp = "Error: Can't divide by zero!",
			dataProvider = "testDivByZeroDataProvider")
	public void div_byZero_returnsIllegalArgumentException(double operand1, double operand2, double total)
			throws IllegalArgumentException {
		operator = Operator.DIVIDE;
		op1 = getOperand(operand1);
		op2 = getOperand(operand2);
		System.out.println("New IllegalArgumentException was thrown");
		Assert.assertEquals(newCalc().makeCalculation(), total);
	}

	@DataProvider(name = "testDivByZeroDataProvider")
	public Object[][] parametersDivByZeroTestProvider() {
		return new Object[][]{
				{1, 0, 0},
				{-1, 0, 0},
				{0, 0, 0}
		};
	}

	@Test(dependsOnMethods = "div_byZero_returnsIllegalArgumentException",
			alwaysRun = true, dataProvider = "testDivDataProvider")
	public void div_twoNumbers_returnsQuot(double operand1, double operand2, double total) {
		operator = Operator.DIVIDE;
		op1 = getOperand(operand1);
		op2 = getOperand(operand2);
		System.out.println("Test Total: " + newCalc().makeCalculation());
		Assert.assertEquals(newCalc().makeCalculation(), total);
	}

	@DataProvider(name = "testDivDataProvider")
	public Object[][] parameterDivTestProvider() {
		return new Object[][]{
				{2, 2, 1},
				{2, 1, 2},
				{0, 1, 0},
				{0, -2, -0.0},
				{-1, 1, -1},
				{1, -1, -1},
				{-1, -1, 1},
				{22, 2, 11},
				{1, 2, 0.5},
				{1, 4, 0.25},
				{-3, 4, -0.75},
				{5, -4, -1.25}
		};
	}
}
