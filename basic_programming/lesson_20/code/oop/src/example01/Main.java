package example01;

public class Main {
    public static void main(String[] args) {
        // имя
        // возраст
        // сколько шагов прошел
        // 4 человека

        // информация разнородная (разнотипная) - не может нормально сгруппировать
        String[] names = new String[5];
        double[] ages = new double[5];
        int[] steps = new int[5];

        // 0 - Марсель 29 1500
        // 1 - Виктория 18 20000
        // 2 - Кенан 18.5 15000
        // 3 - Кирилл 35.5 12000
        // 4 - Петр 34 20000

        names[0] = "Марсель";
        ages[0] = 29.3;
        steps[0] = 4;

        names[1] = "Виктория";
        ages[1] = 18.5;
        steps[1] = 20000;

        names[2] = "Кенан";
        ages[2] = 27.3;
        steps[2] = 15000;

        names[3] = "Кирилл";
        ages[3] = 35.5;
        steps[3] = 12000;

        names[4] = "Петр";
        ages[4] = 34.1;
        steps[4] = 21000;

        // НЕ УДОБНО!

        // мы можем не уследить за индексом
        // нет гарантий, что данные согласованы (я могу удалить что-то из names, но забыть из ages)
        // при увеличении количества характеристик необходимо увеличить массивы (одновременно)
        int i = 0;


    }
}