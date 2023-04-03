import java.util.Random;

public class Task12 {
    /*
    Вывести 10 случайных чисел и сумму их цифр

    Диапазон чисел [1000 - 100 000] явно задается в коде

    Пример вывода:

    4321 -> 10
    1112 -> 5

    и т.д.
     */
    public static void main(String[] args) {
        Random random = new Random();

        int i = 0;

        int number, sum, numberCopy, lastDigit;

        while (i < 10) {
            // генерируем случайное число в диапазоне [1000, 100 000]
            number = random.nextInt(1000, 100000 + 1);
            // заводим переменную для суммы цифр конкретного числа
            sum = 0;
            // копируем сгенерированное число
            numberCopy = number;
            // пока number больше нуля (пока оно true) повторяем все, что внутри фигурных скобок
            while (number > 0) { // number != 0
                // забираем последнюю цифру
                lastDigit = number % 10;
                // кладем эту цифру в общую сумму цифр
                sum = sum + lastDigit;
                // уменьшаем исходное число на одну цифру с конца
                number = number / 10;
            }
            // печатаем число (всегда ноль) и сумму его цифр
            System.out.println(numberCopy + " -> " + sum);
            i = i + 1;
        }
    }
}
