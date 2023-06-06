package task22;

import java.util.Random;

public class Task22 {

    public static void fillArray(Human[] humans) {
        Random random = new Random();
        for (int i = 0; i < humans.length; i++) {
            int generatedAge = random.nextInt(120); // 0 ... 119
            String generatedName = "User" + i;
            Human human = new Human(generatedName, generatedAge);
            humans[i] = human; // кладем нового человека в массив
        }
    }

    // сортировка подсчетом
    public static int[] agesCounts(Human[] humans) { // подсчитаем, сколько раз каждый возраст встречается
        int[] ages = new int[120];
        // ages[0] - содержит количество людей, у которых возраст 0
        // ages[1] - содержит количество людей, у которых возраст 1
        // ages[2] - содержит количество людей, у которых возраст 2
        // ...
        // ages[119] - содержит количество людей, у которых возраст 119
        for (int i = 0; i < humans.length; i++) {
            // берем возраст текущего человека
            int age = humans[i].getAge();
            // идем в массив и увеличиваем на 1 значение в этом массиве
            ages[age]++; // если встретили человека с возрастом 57, то на 1 увеличим ages[57]
        }

        return ages;
    }


    public static void main(String[] args) {
        Human[] humans = new Human[10_000];

        fillArray(humans);
        int[] ages = agesCounts(humans); // массив чисел - индекс - возраст, значение - сколько людей с этим возрастом

        // TODO: найти максимум в ages
        int maxCount = ages[0]; // сколько раз встретился самый частый возраст
        int age = 0; // самый встречаемый возраст

        int i = 0;


    }
}
