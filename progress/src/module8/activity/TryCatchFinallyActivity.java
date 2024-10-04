package module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
}

	void catchMeIfYouCan() {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		try {
			for (int i = 0; i <= 10; i++) { // Loop goes out of bounds here
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException expect) {
			//message of expection
			System.out.println(expect.getMessage());

			//exception with a user-friendly message
			System.out.println("Oops! You've tried to access an index that doesn't exist in the array.");
		} finally {


			System.out.println("This should get printed even if there is an exception.");
			//info for myself )))
			//finally block in Java is always executed regardless of whether an exception occurs or not. This means that the code inside the finally block will be executed in both cases
		}
	}
}
