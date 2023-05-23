package exceptions_and_validation;

public class SpecialCharactersValidator implements Validator {
    @Override
    public void validate(String value) throws ValidationException {
        if (!(value.contains("+") || value.contains("-") || value.contains("!") || value.contains("?"))) {
            throw new ValidationException("Нет ни одного спец символа");
        }
    }
}
