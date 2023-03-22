public class Main {
    public static void main(String[] args) {
        // максимальное значение int
        int i = 2147483647;
        // выводим двоичное представление
        System.out.println(Integer.toBinaryString(i));
        // увеличиваем на 1, получаем переполнение в отрицательную сторону
        i = i + 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        // делаем переполнение в отрицательную сторону
        i = i - 1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
    }
}
