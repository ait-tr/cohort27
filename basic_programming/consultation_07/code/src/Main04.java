import java.util.Random;

public class Main04 {

    // написать функцию, которая возвращает случайный элемент массива
    public static String getRandomWord(String[] array) {
        Random random = new Random();
        for (String s : array) { // s ~ array[i]
            // сгенерировали случайное число
            int randomNumber = random.nextInt();
            // если это случайное число - четное
            if (randomNumber % 2 == 0) {
                // возвращаем текущее слово
                return s;
            }
        }
        // если ни одно из случайных чисел не было четным
        return "empty";
    }

    public static void main(String[] args) {
        // распечатать несколько слов массива
        String[] words = {"Hello", "Bye", "Marsel", "29", "1.85"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]); // печатаем i-ый элемент массива
        }

        System.out.println("----");
        // foreach - синтаксический сахар на for, используется когда просто нужно перебрать все элементы массива
        // на каждой итерации (одно действие цикла) цикла в переменной word
        // будет очередной элемент массива
        for (String s : words) { // s ~ words[i]
            System.out.println(s);
        }

        System.out.println("------");
        System.out.println(getRandomWord(words));
    }
}
