import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // найти среднее арифметические
        int number; // текущее число
        int numbersSum = 0; // сумма чисел
        int numbersCount; // количество чисел
        double average; // среднее

        numbersCount = scanner.nextInt();

        for (int i = 0; i < numbersCount; i++) {
            number = scanner.nextInt();
            numbersSum += number;
        }

        average = numbersSum / (numbersCount * 1.0);
        System.out.println(average);
    }
}
