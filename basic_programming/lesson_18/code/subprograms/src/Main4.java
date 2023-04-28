public class Main4 {

    public static long sumLong(int a, int b) {
        int result = a + b;

        return result;
    }

    public static int sum(int a, int b) {
        long sum = a + b;

        return (int)sum;
    }

    public static void main(String[] args) {
//        int c = sum(10, 15); // c = 25

        long x = 3000_000_000L;
        int b = (int)x;
        System.out.println(b);
        int a = 10;
        long l = a;
        l = 'A';
        l = b;
    }
}
