import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int digit1, digit2, digit3;

//        int randomNumber1 = random.nextInt(100, 151);
//        int randomNumber1 = 100 + random.nextInt(51);
        int randomNumber1 = 101;

        digit3 = randomNumber1 % 10;
        randomNumber1 = randomNumber1 / 10;

        digit2 = randomNumber1 % 10;
        randomNumber1 = randomNumber1 / 10;

        digit1 = randomNumber1 % 10;

        int randomNumber1DigitsSum = digit1 + digit2 + digit3;

        int userNumber1 = scanner.nextInt();

        digit3 = userNumber1 % 10;
        userNumber1 = userNumber1 / 10;

        digit2 = userNumber1 % 10;
        userNumber1 = userNumber1 / 10;

        digit1 = userNumber1 % 10;

        int userNumber1DigitsSum = digit1 + digit2 + digit3;

        int diff1 = randomNumber1DigitsSum - userNumber1DigitsSum;

        System.out.println("Результат работы программы: " + diff1);
    }
}
