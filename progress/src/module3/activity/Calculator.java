/**
 * 
 */
package module3.activity;

/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) {
		
	int x = 10;
	int y = 5;
	
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y; // If x is greater than y, subtract y from x
		} else {
			diff = y - x; // If y is greater than x, subtract x from y
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			System.out.println("Cannot divide by zero."); // Handle division by zero case
		} else {
			divValue = x / y; // Perform division if both numbers are valid
		}
		return divValue;

	}
	
}

