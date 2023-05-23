package exceptions_and_validation;

public class UppercaseValidator implements Validator{
    @Override
    public void validate(String value) throws ValidationException {
        boolean hasUppercaseLetter = false; //предполагаю, что больших букв нет
        char[] characters = value.toCharArray(); // преобразую строку в массив символов
        for (char c : characters) { // смотрю каждый символ исходной строки
            if (Character.isUpperCase(c)) { // если этот символ - большая буква
                hasUppercaseLetter = true; // понимаю, что есть большая буква
                break; // останавливанию проверку
            }
        }

        if (!hasUppercaseLetter) {
            // если я в итоге не нашел ни одной большой буквы - выбрасываю исключение
            throw new ValidationException("Нет ни одной большой буквы");
        }
    }
}
