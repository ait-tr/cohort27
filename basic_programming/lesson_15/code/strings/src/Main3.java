import java.util.Scanner;

public class Main3 {
    // Реализовать словарь с подсказками
    // пользователь вводит слово, если для него есть подсказки - то они предлагаются
    // если нет - слово добавляется в словарь

    // мед
    // -> медь
    // -> медведка
    // -> мед
    // -> медаль
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // количество слов в словаре
        int wordsCount = 0;
        // сам словарь - массив строк
        String[] dictionary = new String[10];

        while (true) {
            // считываем слово
            String word = scanner.nextLine();
            dictionary[wordsCount] = word;
            wordsCount++;
        }
    }
}