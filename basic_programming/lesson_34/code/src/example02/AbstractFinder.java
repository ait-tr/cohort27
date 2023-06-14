package example02;

import java.util.Scanner;

/**
 * 6/14/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class AbstractFinder {

    protected int[] elements;

    public AbstractFinder(int[] elements) {
        this.elements = elements;
    }

    /**
     * Проверяет, есть ли element в массиве
     * @param element искомый элемент
     * @return <code>true</code> если элемент есть, <code>false</code> в противном случае
     */
    public abstract boolean find(int element);

    public void findNumberAndPrint() { // общий алгоритм
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean result = find(number); // шаг, но без конкретной реализации

        System.out.println("Число найдено? - " + result);
    }
}
