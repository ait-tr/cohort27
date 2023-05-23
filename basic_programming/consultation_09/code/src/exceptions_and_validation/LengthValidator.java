package exceptions_and_validation;

public class LengthValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        if (value.length() < 5) {
            throw new ValidationException("Длина пароля слишком маленькая");
        }
    }
}
