/**
 * 7/11/2023
 * Example
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main2 {
    public static int myHashCode(String key) { // функция, которая преобразует строку в число (будущий индекс в нашем Map)
        // сначала получим посимвольное представление исходной строки
        char[] chars = key.toCharArray();
        // посчитаем сумму кодов всех букв
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result = result + chars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int h1 = "Marsel".hashCode();
        int h2 = "Masrel".hashCode();
        System.out.println(h1);
        System.out.println(h2);
    }
}
