import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int[] a = {88, 58, 73, 53, 31, 68, 1, 52, 31, 73, 54, 88, 5, 8, 31};

        Scanner scanner = new Scanner(System.in);

        int numberForSearch = scanner.nextInt();

        // вывести индекс этого числа, если оно там есть, либо вывести -1, если его там нет
        // numberForSearch = 31, программа выводит - 4
        boolean isExists = false; // существует = ложь
        // пробегаем все элементы массива
        for (int i = 0; i < a.length; i++) { // for (int i = a.length - 1; i >= 0; i--) - если хотим с конца
            // если текущий элемент равен искомому
            if (a[i] == numberForSearch) {
                isExists = true; // существует = правда
                // печатаю индекс найденный
                System.out.println(i);
                // останавливаю цикл
                break; // если убрать break - выведет все позиции этого числа в массиве, если встречается несколько раз
            }
        }
        // если не существует
        if (!isExists) { // isExists != true
            System.out.println("-1");
        }
    }
}
