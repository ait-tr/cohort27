package exceptions_and_validation;

public class Main {
    // написать валидатор данных
    // например - есть входная строка, необходимо пропустить ее через цепочку валидаторов
    public static void main(String[] args) {
        String password = "Qwe!";

        ValidatorPipeline validator = new ValidatorPipeline();

        LengthValidator lengthValidator = new LengthValidator();
        LowercaseValidator lowercaseValidator = new LowercaseValidator();
        UppercaseValidator uppercaseValidator = new UppercaseValidator();
        SpecialCharactersValidator specialCharactersValidator = new SpecialCharactersValidator();

        validator.addValidator(lengthValidator);
        validator.addValidator(lowercaseValidator);
        validator.addValidator(uppercaseValidator);
        validator.addValidator(specialCharactersValidator);

        validator.validate(password);
    }
}
