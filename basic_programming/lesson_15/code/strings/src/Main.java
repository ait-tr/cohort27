import java.util.Scanner;

public class Main {
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

        // количество слов, которое может вместить словарь
        int dictionaryLength = 10;
        // количество слов в словаре
        int wordsCount = 0;
        // сам словарь - массив строк
        String[] dictionary = {"медь", "проволока", "медаль", "клавиатура", "медведка", "спирулина"};

        while (true) {
            // считываем слово
            String word = scanner.nextLine();

            // нужно найти слово в словаре (есть ли слова, которые начинаются с этого слова)
            // пробегаемся по всем словам
            for (int i = 0; i < dictionary.length; i++) {
                // если слово начинается с введенного префикса
                if (dictionary[i].startsWith(word)) {
                    // выводим это слово в консоль
                    System.out.println("->" + dictionary[i]);
                }
            }
        }




    }
}