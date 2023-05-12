package example01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
5
Marsel
3000
Andreas
10000
Vadim
9000
Dmitriy
12000
Vika
3000000
     */

    /*
5
Marsel
3000
29
11
Andreas
10000
35
20
Vadim
9000000
18
1
Dmitriy
12000
30
10
Vika
300
18
1
     */

    // задача - есть люди, у них есть имена, есть количество шагов, есть возраст, и опыт работы (в годах) которое они могут пройти
    // необходимо выяснить, какой человек прошел больше всего шагов?
    // необходимо выяснить, какой человек старше других?
    // необходимо выяснить, какой человек самый опытный?
    public static String getMaxStepsCountUser(int usersCount, String[] names, int[] stepsCount) {
        int maxStepsCount = stepsCount[0]; // предполагаем, что первый элемент массива максимум
        int maxStepsCountIndex = 0; // индекс текущего максимума - 0
        // начиная с первой позиции - проходим все элементы массива
        for (int i = 1; i < usersCount; i++) {
            if (stepsCount[i] > maxStepsCount) { // если i-ый элемент оказался больше, чем максимум
                maxStepsCount = stepsCount[i]; // делаем его максимумом - 3000
                maxStepsCountIndex = i; // запомнили его индекс
            }
        }
        // возвращаем имя, которое находится под индексом максимального количества шагов
        return names[maxStepsCountIndex];
    }

    public static String getAgeUser(int usersCount, String[] names, int[] ages) {
        int maxAge = ages[0];
        int maxAgeIndex = 0;

        for (int i = 1; i < usersCount; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
                maxAgeIndex = i;
            }
        }

        return names[maxAgeIndex];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usersCount = scanner.nextInt(); // считываем количество пользователей
        scanner.nextLine();

        // names[3] = Marsel, stepsCount[3] = 10, ages[3] = 29 Марсель прошел 10 шагов и ему 29 лет

        String[] names = new String[usersCount]; // объявляем массив имен
        int[] stepsCount = new int[usersCount]; // объявляем массив количества шагов
        int[] ages = new int[usersCount]; // объявляем массив возрастов
        int[] experience = new int[usersCount];

        for (int i = 0; i < usersCount; i++) {
            names[i] = scanner.nextLine(); // считали имя
            stepsCount[i] = scanner.nextInt(); // считали количество шагов
            ages[i] = scanner.nextInt(); // считываем возраст
            experience[i] = scanner.nextInt();
            scanner.nextLine(); // спустились на новую строку
        }

//        ages[0] = -100;

        String temp = names[0];
        names[0] = names[1];
        names[1] = temp;

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(stepsCount));
        System.out.println(Arrays.toString(ages));

        String name = getMaxStepsCountUser(usersCount, names, stepsCount);
        String name2 = getAgeUser(usersCount, names, ages);
        System.out.println(name2);

        char c;

    }
}
