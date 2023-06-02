package example01;

public class Printer {
    private Table table; // с данным принтером связана таблица
    private String separator; // разделитель ключа и значения для вывода в консоль

    public Printer(Table table, String separator) { // передаем конкретную таблицу данному принтеру
        this.table = table;
        this.separator = separator;
    }

    public void print() {
        Pair[] pairs = table.getPairs();// получили доступ ко всем парам из таблицы
        for (int i = 0; i < table.getCount(); i++) { // пробегаем все пары
            System.out.println(pairs[i].getKey() + separator + pairs[i].getValue()); // печатаем ключ и значение через разделитель
        }
    }

}
