package exceptions_and_validation;

public class LowercaseValidator implements Validator{
    @Override
    public void validate(String value) throws ValidationException {
        boolean hasLowercaseLetter = false; //предполагаю, что маленьких букв нет
        char[] characters = value.toCharArray(); // преобразую строку в массив символов
        for (char c : characters) { // смотрю каждый символ исходной строки
            if (Character.isLowerCase(c)) { // если этот символ - маленькая буква
                hasLowercaseLetter = true; // понимаю, что есть маленькая буква
                break; // останавливанию проверку
            }
        }

        if (!hasLowercaseLetter) {
            // если я в итоге не нашел ни одной маленькой буквы - выбрасываю исключение
            throw new ValidationException("Нет ни одной маленькой буквы");
        }
    }
}
