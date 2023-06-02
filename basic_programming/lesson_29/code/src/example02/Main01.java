package example02;

public class Main01 {
    public static void main(String[] args) {
        Table table1 = new Table(); // создаем экземпляр, вызываем конструктор
        table1.put("Марсель", 29);
        table1.put("Виктория", 18);
        table1.put("Петр", 33);

        // пример мутации массива пар
//        Table.Pair[] p = table1.getPairs();
//        p[1] = null;

        int c = table1.getCount(); // c = 3
        c++; // на оригинальном count не скажется

        System.out.println(table1.get("Виктория"));
        // создаем экземпляр класс Pair (нужно только для демонстрации)

    }
}
