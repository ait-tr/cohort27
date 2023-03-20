import java.util.Random;
import java.util.Scanner;

public class Ex1 {

    // 1-ое задание
    // одно - сгенерировать случайное число

    // второе - считать число с консоли

    // сложить два числа и положить результат
    // в переменную result

    // вывести в консоль Результат = <результат>
    public static void main(String[] args) {
        // например, пользователь ввел 15, компьютер придумал 10, вывести Результат = 25

        // создаем генератор случайных чисел и называем его r
        Random random = new Random();
        // генерируем число с помощью генератора r
        int randomNumber = random.nextInt(100); // 0 .. 99


        // создали сканнер для чтения данных с консоли и назвали его s
        Scanner scanner = new Scanner(System.in);
        // считываем число с консоли с помощью сканнера s
        int userRandom = scanner.nextInt();

        // складываем оба числа
        int result = randomNumber + userRandom;

        System.out.println("Результат = " + result);
        System.out.println(randomNumber);
    }
}
