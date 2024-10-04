package module8.activity;
// Needs to be completed
public class ArithmeticExceptionActivity {
	// 1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args) {
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();

		// Call with 10 and 0, this will cause an exception
		obj.catchMe(10, 0);

		// Call with 10 and 2, this will work without exception
		obj.catchMe(10, 2);
	}

	void catchMe(int num1, int num2) {
		try {
			// 2 - Identify the exception and write code to handle this exception.
			int result = num1 / num2;
			System.out.println("The result is: " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero. Please provide a valid denominator.");
		}
		finally {
			// 3 - After handling the exception, write a finally block which prints a message
			System.out.println("Thank you for using this program.");
		}

		// 4 - try to call catchMe with 10 and 2 now and see which messages get printed.
	}
}
