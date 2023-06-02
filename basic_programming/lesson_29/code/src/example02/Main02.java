package example02;

public class Main02 {
    public static void main(String[] args) {
        Table table1 = new Table(); // создаем экземпляр, вызываем конструктор
        table1.put("Марсель", 29);
        table1.put("Виктория", 18);
        table1.put("Петр", 33);
        table1.put("Марсель", 30);
        table1.put("Петр", 34);

        Table table2 = new Table();
        table2.put("Руслан", 41);
        table2.put("Вадим", 27);
        table2.put("Андреас", 35);

        Table.Printer p1 = new Table.Printer(table1, "|");
        Table.Printer p2 = new Table.Printer(table2, " - ");

        p1.print();
        p2.print();

        System.out.println(table1.getCount());
    }
}
