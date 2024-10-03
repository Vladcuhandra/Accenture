/**
 * 
 */
package module4.activity;

/**
 * @author 
 *
 */
public class Calculator {

	
	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";
	
	// Default constructor
	public Calculator() {
		this.calculatorType = CALC_TYPE_BASIC;
	}

	// Parameterized constructor
	public Calculator(String calculatorType) {

		this.calculatorType = calculatorType;
	}

	// Getter for CalculatorType
	public String getCalculatorType() {

		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {

		this.calculatorType = calculatorType;
	}
	
	// Add 
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	public int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	// Multiply
	public int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	// Divide
	public int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			divValue = 0;
		} else {
			divValue = x / y;
		}
		return divValue;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println("Calculator Type: " + calc.getCalculatorType());

		int x = 10;
		int y = 5;
		int[] nums = {2, 3, 4};

		System.out.println("Addition: " + calc.add(x, y));
		System.out.println("Subtraction: " + calc.subtract(x, y));
		System.out.println("Multiplication: " + calc.multiply(nums));
		System.out.println("Division: " + calc.divide(x, y));
	}
}
