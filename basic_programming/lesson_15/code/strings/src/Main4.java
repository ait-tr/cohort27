import java.util.Scanner;

public class Main4 {
    // Реализовать словарь с подсказками
    // пользователь вводит слово, если для него есть подсказки - то они предлагаются
    // если нет - слово добавляется в словарь

    // мед
    // -> медь
    // -> медведка
    // -> медаль
    // клавиатура
    // кла
    // -> клавиатура
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // общее количество слов
        int wordsCount = 0;
        // сам словарь, массив из десяти строк
        String[] dictionary = new String[10];
        // бесконечный цикл
        while (true) {
            // считываем слово с консоли
            String word = scanner.nextLine();

            boolean isContains = false; // мы предполагаем, что слова в словаре нет

            // ищем слова, которые начинаются с нужного префикса в словаре
            for (int i = 0; i < wordsCount; i++) {
                // смотрим, не начинается ли i-ое слово в словаре со слова word, которое ввел пользователь
                if (dictionary[i].startsWith(word)) {
                    // если начинается - печатаем это i-ое словом
                    System.out.println("->" + dictionary[i]);
                    // говорим, что слово нашли в словаре
                    isContains = true;
                }
            }
            // когда посмотрели весь словарь
            // если слово не было найдено
            if (!isContains) {
                // добавляем слово в словарь
                dictionary[wordsCount] = word;
                wordsCount++;
            }
        }
    }
}
