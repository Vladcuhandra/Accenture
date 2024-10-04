package module8.activity;

// 1 - Extend this class from Exception class (not Throwable)
public class CustomExceptionActivity extends Exception {

    // 2 - Override getMessage() and provide the custom message
    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }

    // Optionally, you can also add constructors to initialize the exception
    public CustomExceptionActivity() {
        super();
    }

    public CustomExceptionActivity(String message) {
        super(message);
    }
}
