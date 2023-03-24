package characters;

public class Main {
    public static void main(String[] args) {
        // объявляем переменную символьного
        // типа
        char c;
        // присваиваем ей значение
        c = 'A';
        System.out.println(c);
        // получаем код символа
        int code = c;
        // выводим в консоль
        System.out.println(code);
        // на основе кода символа
        int codeOfD = 68;
        // получаем символ
        char dCharacter = (char)codeOfD;
        // выводим символ в консоль
        System.out.println(dCharacter);
    }
}
