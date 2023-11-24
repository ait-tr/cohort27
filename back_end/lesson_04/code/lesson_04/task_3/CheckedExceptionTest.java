package lesson_04.task_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        try {
            test();
        } catch (IOException | ArithmeticException e) {
            System.out.println("Возникла какая-то ошибка!");
        }
    }

    public static void test() throws IOException {

        FileReader reader = new FileReader("test.txt");

        System.out.println((char) reader.read());

        reader.close();

        int x = 15;
        int y = 0;
        System.out.println(x / y);
    }
}