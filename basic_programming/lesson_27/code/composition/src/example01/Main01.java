package example01;

import java.util.Scanner;

public class Main01 {
    // реализовать сервис по обслуживанию автопарка
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Driver driver = new Driver("Marsel", 5);

        System.out.println("Опыт водителя - " + driver.getExperience());
        System.out.println("Введите новое значение опыта, чтобы его изменить:");

        int experience = scanner.nextInt();

        driver.setExperience(experience);

        System.out.println("Новый опыт водителя " + driver.getExperience());
    }
}
