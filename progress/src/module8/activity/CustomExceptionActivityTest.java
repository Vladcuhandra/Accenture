package module8.activity;

public class CustomExceptionActivityTest {

    // Main method to test the validateUser method
    public static void main(String[] args) {
        try {
            validateUser("Johnn");  // Replace this with various names to test.
            validateUser("John");
        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }

    static void validateUser(String name) throws CustomExceptionActivity {
        // Array of valid names
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag stores 1 if a match is found, otherwise it remains 0
        int flag = 0;

        // Loop through the validUsers array to check if the name exists
        for (int i = 0; i < validUsers.length; i++) {
            // Use equals() to compare strings
            if (name.equals(validUsers[i])) {
                flag = 1;
                break;
            }
        }

        // If flag is still 0, throw a custom exception
        if (flag == 0) {
            throw new CustomExceptionActivity("User " + name + " is not a valid user.");
        } else {
            // If valid user, print welcome message
            System.out.println("Welcome to Payroll program, " + name + "!");
        }
    }
}

