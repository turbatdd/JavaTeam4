package assignmentLesson12.prob2;

public class AccountException extends RuntimeException {
    public AccountException(String message) {
        super(message);
    }

    public AccountException() {
        super();
    }
}
