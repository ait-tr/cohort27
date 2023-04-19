import java.util.Scanner;

public class Main2 {
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
        int wordsCount = 6;
        // сам словарь - массив строк
        String[] dictionary = new String[10];
        dictionary[0] = "медведь";
        dictionary[1] = "медаль";
        dictionary[2] = "клавиатура";
        dictionary[3] = "мышь";
        dictionary[5] = "спирулина";
        // dictionary[5] -> null

        while (true) {
            // считываем слово
            String word = scanner.nextLine();

            // нужно найти слово в словаре (есть ли слова, которые начинаются с этого слова)
            // пробегаемся по всем словам
            for (int i = 0; i < wordsCount; i++) {
                // если слово начинается с введенного префикса
                // dictionary[0].startsWith(word)
                // dictionary[0] -> null
                // null.startsWith(word)
                if (dictionary[i].startsWith(word)) {
                    // выводим это слово в консоль
                    System.out.println("->" + dictionary[i]);
                }
            }
        }
    }
}