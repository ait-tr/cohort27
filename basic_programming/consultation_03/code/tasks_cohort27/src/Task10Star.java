import java.util.Scanner;

public class Task10Star {
    public static void main(String[] args) {
        // программа должна работать пока пользователь не введет -1

        Scanner scanner = new Scanner(System.in);

        int number;
        boolean isNotCompleted = true;

        if (isNotCompleted) {
            System.out.println("Введите число");
            number = scanner.nextInt();

            if (number == -1) {
                isNotCompleted = false;
            }
        }

        if (isNotCompleted) {
            System.out.println("Введите число");
            number = scanner.nextInt();

            if (number == -1) {
                isNotCompleted = false;
            }
        }

        if (isNotCompleted) {
            System.out.println("Введите число");
            number = scanner.nextInt();

            if (number == -1) {
                isNotCompleted = false;
            }
        }
    }
}

// Сидиков - Сидик
// Ситдиков - Ситдик
