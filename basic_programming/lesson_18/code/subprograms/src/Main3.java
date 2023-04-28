public class Main3 {

    public static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static long sumLong(int a, int b) {
        int result = a + b;

        return result;
    }

    public static double pow(double a) {
        double result = a * a * a;

        return result;
    }

    public static boolean isEven(int a) {
        boolean result = a % 2 == 0;

        return result;
    }

    public static String concat(String a1, String a2) {
        String result = a1 + a2;

        return result;
    }

    public static int toUnicodeNumber(char c) {
        return c;
    }

    public static void main(String[] args) {
        int a = 10;
        long l = a;

        int code = toUnicodeNumber('A');
        System.out.println(code);

        int i = sum(10, 15);
        double d = pow(0.5);
        boolean b = isEven(15);
        String s = concat("Hello", "Bye");

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);

    }
}
