public class Main5 {

    public static void main(String[] args) {
        boolean b1 = isEven(10);
        String s1 = concat("Hello", "Bye");
//        int x = isEven(16);
    }

    public static boolean isEven(int a) {
        boolean result = a % 2 == 0;

        return result;
    }

    public static String concat(String a1, String a2) {
        String result = a1 + a2;

        return result;
    }
}
