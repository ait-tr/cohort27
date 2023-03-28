package consultation;

import java.util.Scanner;

/*

Считайте два символа маленьких буквы с консоли (например a и c)
Выведите коды обоих символов с консоли
Вывод следующего символа после каждого из символов (для a - это b, для c - это d)
Напечатайте на основе маленькой буквы большую (для a - это A)
Считайте с консоли число (от 65 до 127)
Получите на основе этого числа символ (например, если ввели 65, нужно вывести A)
Считайте два символа-цифры с консоли (например 5 и 9), напечатайте в консоль сумму соответствующих чисел, то есть для 5 и 9 это будет 14

 */
public class Task09Additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // считали два символа
        char character1 = scanner.next().charAt(0);
        char character2 = scanner.next().charAt(0);
        // получили их код
        int code1 = character1;
        int code2 = character2;
        // вывели их в консоль
        System.out.println(code1);
        System.out.println(code2);
        // увеличили код каждого символа на 1
        int code3 = code1 + 1;
        int code4 = code2 + 1;
        // преобразовали полученные коды в символы
        char character3 = (char)code3;
        char character4 = (char)code4;
        // вывели полученные символы
        System.out.println(character3);
        System.out.println(character4);
        // получаем коды больших букв
        int code5 = code1 - 32;
        int code6 = code2 - 32;
        // преобразуем их в символы
        char character5 = (char)code5;
        char character6 = (char)code6;
        // выводим полученные символы в консоль
        System.out.println(character5);
        System.out.println(character6);
        // считываем число для того чтобы на его основе получить символ
        int code7 = scanner.nextInt();
        char character7 = (char)code7;
        System.out.println(character7);
        // считываем два символа-цифры
        char digit1 = scanner.next().charAt(0); // '5'
        char digit2 = scanner.next().charAt(0); // '9'
        int number1 = digit1 - '0'; // 5
        int number2 = digit2 - '0'; // 9
        int sum = number1 + number2;
        System.out.println(sum);
    }
}
