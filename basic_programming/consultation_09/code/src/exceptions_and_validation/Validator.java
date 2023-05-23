package exceptions_and_validation;

public interface Validator { // интерфейс валидатора
    void validate(String value) throws ValidationException; // метод проверки строки
}
