public class Main10 {
    public static void main(String[] args) {
        // создаем переменную
        int x = 8;
        // создаем еще одну переменную и ее значение копируем в y
        int y = x;
        // меняем значение, которое лежит в y
        y = 10;
        // печатаем x и там лежит старое значение
        System.out.println(x);
        // создаем массив из трех элементов
        // создаем переменную a, которая является указателем на первый элемент массива
        // т.е. a указывает на адрес a[0]
        int[] a = {4, 3, 1};
        // создаем переменную b, которая копирует значение, лежащее в a
        // таким образом, в b тоже лежит адрес a[0]
        int[] b = a;
        // мы обращаемся к массиву, на который указывают и a и b
        // следовательно, изменение значения через b влияет на a
        // потому что это один и тот же массив
        b[1] = 777;
        System.out.println(a[1]);
    }
}
