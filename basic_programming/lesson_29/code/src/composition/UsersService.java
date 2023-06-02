package composition;

public class UsersService {

    private PasswordValidator validator;

    public UsersService(PasswordValidator validator) {
        this.validator = validator;
    }

    public void signUp(String email, String password) {
        if (validator.validate(password)) {
            System.out.println(email + " зарегистрирован");
        } else {
            System.err.println("Ошибка валидации");
        }
    }
}
