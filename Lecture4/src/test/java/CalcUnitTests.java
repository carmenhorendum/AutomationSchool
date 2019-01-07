import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcUnitTests {

	@Test(dataProvider = "testAddDataProvider")
	public void checkSum(double operand1, double operand2, double total) {
		Calculator calculator = new Calculator(operand1, Operator.PLUS, operand2);
		double result = calculator.makeCalculation();
		System.out.println("Test Total: " + result);
		Assert.assertEquals(result, total);
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
	public void checkDifference(double operand1, double operand2, double total) {
		Calculator calculator = new Calculator(operand1, Operator.MINUS, operand2);
		double result = calculator.makeCalculation();
		System.out.println("Test Total: " + result);
		Assert.assertEquals(result, total);
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
	public void checkProduct(double operand1, double operand2, double total) {
		Calculator calculator = new Calculator(operand1, Operator.MULTIPLY, operand2);
		double result = calculator.makeCalculation();
		System.out.println("Test Total: " + result);
		Assert.assertEquals(result, total);
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
	public void checkDivisionByZero(double operand1, double operand2, double total) {
		Calculator calculator = new Calculator(operand1, Operator.DIVIDE, operand2);
		Assert.assertEquals(calculator.makeCalculation(), total);
	}

	@DataProvider(name = "testDivByZeroDataProvider")
	public Object[][] parametersDivByZeroTestProvider() {
		return new Object[][]{
				{1, 0, 0},
				{-1, 0, 0},
				{0, 0, 0}
		};
	}

	@Test(dependsOnMethods = "checkDivisionByZero",
			alwaysRun = true, dataProvider = "testDivDataProvider")
	public void checkQuotient(double operand1, double operand2, double total) {
		Calculator calculator = new Calculator(operand1, Operator.DIVIDE, operand2);
		double result = calculator.makeCalculation();
		System.out.println("Test Total: " + result);
		Assert.assertEquals(result, total);
	}

	@DataProvider(name = "testDivDataProvider")
	public Object[][] parameterDivTestProvider() {
		return new Object[][]{
				{2, 2, 1},
				{2, 1, 2},
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
