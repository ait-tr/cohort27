package switch_case;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        boolean isRun = true;

        while (isRun) {
            // считываем новое слово
            word = scanner.nextLine();
            switch (word) {
                case "Array":
                    System.out.println("Массив");
                    break;
                case "Variable":
                    System.out.println("Переменная");
                    break;
                case "Equals":
                    System.out.println("Сравнить");
                    break;
                case "Exit":
                    System.out.println("Переводим как Выход, ну и выходим из программы");
                    isRun = false;
                    break;
                default:
                    System.out.println("Слово не распознано");
            }
        }
    }
}
