public class JavaMethods {
    // подпрограмма - блок кода, который имеет название и его можно вызывать несколько раз по имени
    // подпрограмм - функции и процедуры

    // функция
    // в явном виде возвращает значение своих вычислений
    // в данном случае это сумма чисел a и b
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int pow2(int a) {
        return a * a;
    }

    // процедура
    // не возвращает значения в явном виде, но обладает побочным эффектом
    public static void printInRange(int from, int to) {
        int i = from;

        while (i <= to) {
            System.out.print(i + " ");
            i = i + 1;
        }

        // return значение; - НЕ МОЖЕТЕ
    }

    public static void main(String[] args) {
        int x = sum(5, 6);
        int y = pow2(5);

        System.out.println(x + " " + y);

//        int z = printInRange(10, 15); - ТАК НЕЛЬЗЯ

        printInRange(10, 15);
    }
}
