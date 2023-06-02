package example02;

public class Table { // реализация ассоциативного массива

    private static class Pair {
        private String key;
        private int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static class Printer {
        private Table table; // с данным принтером связана таблица
        private String separator; // разделитель ключа и значения для вывода в консоль

        public Printer(Table table, String separator) { // передаем конкретную таблицу данному принтеру
            this.table = table;
            this.separator = separator;
        }

        public void print() {
            Table.Pair[] pairs = table.pairs;// получили доступ ко всем парам из таблицы
            for (int i = 0; i < table.count; i++) { // пробегаем все пары
                System.out.println(pairs[i].key + separator + pairs[i].value); // печатаем ключ и значение через разделитель
            }
        }
    }

    private Pair[] pairs; // массив пар ключ-значение
    private int count; // количество пар ключ-значение

    public Table() { // конструктор - вызывается при создании объекта
        this.pairs = new Pair[10]; // мы выделяем память для 10-ти пар ключ-значение
        this.count = 0; // изначально у нас никаких пар нет
    }

    public void put(String key, int value) {
        // прежде, чем добавлять новую пару, давайте проверим, а не было ли уже такой пары в нашей таблице
        for (int i = 0; i < count; i++) {// пробегаем все пары
            if (pairs[i].key.equals(key)) { // если у текущей i-ой пары ключ совпал с тем, что мы добавляем
                pairs[i].value = value; // пара, у которой ключ совпал с тем, что мы добавляем - заменяем значение
                return;
            }
        }
        // если пары с таким ключом еще не было - создаем новую пару
        Pair pair = new Pair(key, value); // создаем объект пары ключ-значение
        this.pairs[count] = pair; // положили в массив
        count++; // увеличили количество элементов на 1
    }

    // получаем какое-либо значение по ключу
    public int get(String key) {
        for (int i = 0; i < count; i++) { // побежим все пары ключ-значение
            if (pairs[i].key.equals(key)) { // если текущая пара содержит нужный ключ
                return pairs[i].value; // возвращаем значение
            }
        }
        // если под таким ключом ничего нет - возвращаем -1
        return -1;
    }

//    public Pair[] getPairs() {
//        return pairs;
//    }

    public int getCount() {
        return count;
    }
}
