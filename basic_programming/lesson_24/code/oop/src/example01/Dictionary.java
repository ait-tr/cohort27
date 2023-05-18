package example01;

public class Dictionary {

    private String[] data; // массив, который хранит слова
    private int count; // количество слов в словаре
    public Dictionary(int initialSize) {
        this.data = new String[initialSize]; // создали массив с нужным размером
    }

    public Dictionary() {
        this(10); // чтобы не дублировать код
    }

    public void add(String word) {
        // если массив переполнен
        if (count == data.length) {
            System.err.println("Массив переполнен");
            return; // остановка работы метода
            // resize()
        }
        this.data[count] = word;
        this.count++;
    }

    /*
    // -> Mar
    // Marsel
    // Markus
    // Compass
    // Paris
    // Marmelad
    // getWordsByPrefix("Mar")
    // Marsel, Markus, Marmelad, null
    // Marsel, Markus, Marmelad
    public String[] getWordsByPrefix(String prefix) {
        int resultWordsCount = 0; // сколько слов начинаются с нужного префикса
        // пройдем по всему массиву и посчитаем, сколько слов
        // реально начинаются на префикс
        for (int i = 0; i < count; i++) {
            if (data[i].startsWith(prefix)) { // если встретили такое слово в массиве
                resultWordsCount++; // увеличиваем их количество
            }
        }
        // массив на два элемента, если только два элемента начинаются с нужного префикса
        String[] result = new String[resultWordsCount]; // массив с результатом

        int indexOfResult = 0; // переменная нужна для того, чтобы последовательно класть элементы
        // еще раз пробегаем массив и те слова, которые начинаются с нужного префикса - мы занесем в результат
         for (int i = 0; i < count; i++) {
             if (data[i].startsWith(prefix)) { // если слово начинается с нужного префикса
                 result[indexOfResult] = data[i]; // кладем его в массив-результат
                 indexOfResult++; // увеличиваем индекс для массива-индекс
             }
         }

         return result;
    }
     */

    public String[] getWordsByPrefix(String prefix) {
        NodeString first = new NodeString("temp"); // узел, который содержит слово temp
        NodeString current = first; // сделали еще один указатель на первый узел

        int resultWordsCount = 0;
        for (int i = 0; i < count; i++) { // пробегаем массив всех слов
            if (data[i].startsWith(prefix)) { // если встретили такое слово в массиве
                NodeString newNode = new NodeString(data[i]); // сделали с этим словом
                current.next = newNode; // новый узел следующий после текущего
                current = current.next; // сдвигаем текущий указатель на новый узел
                resultWordsCount++; // увеличиваем их количество
            }
        }
        first = first.next; // избавляемся от temp
        // мы получили узлы, которые хранят нужные слова и их количество
        // теперь их просто нужно перенести в массив
        // массив нужной размерности
        String[] result = new String[resultWordsCount]; // массив с результатом

        current = first; // начинаем с первого элемента
        int index = 0;
        while (current != null) { // пока не прошли все узлы
            result[index] = current.getValue(); // нужно положить значение узла в массив
            index++;

            current = current.next; // идем дальше
        }
        return result;
    }

}
