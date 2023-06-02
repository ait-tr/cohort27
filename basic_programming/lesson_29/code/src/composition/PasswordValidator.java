package composition;

public class PasswordValidator {
    private int minLength;

    public PasswordValidator(int minLength) {
        this.minLength = minLength;
    }

    public boolean validate(String password) {
        return password.length() >= minLength;
    }
}