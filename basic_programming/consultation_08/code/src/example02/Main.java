package example02;

import java.util.Scanner;

/*
5
Marsel
3000
-1000
-100
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
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usersCount = scanner.nextInt();
        scanner.nextLine(); // спустились на новую строку
        // создаем массив людей
        User[] users = new User[usersCount];

        for (int i = 0; i < usersCount; i++) {
            String name = scanner.nextLine(); // считали имя
            int stepsCount = scanner.nextInt(); // считали количество шагов
            int age = scanner.nextInt(); // считываем возраст
            int experience = scanner.nextInt();
            scanner.nextLine(); // спустились на новую строку

            // создаю человека с нужными мне характеристиками
            User user = new User(name, stepsCount, age, experience);
            // этого человека нужно положить в массив
            users[i] = user;
        }

//        users[0].age = -100;

        System.out.println(users[0].getAge() + " " + users[0].getName() + " " + users[0].getExperience() + " " + users[0].getStepsCount());
    }
}
