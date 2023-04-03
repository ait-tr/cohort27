public class Main3 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x++;

            int lastDigit = x % 10;
            System.out.println(lastDigit);
            if (true) {
                System.out.println(lastDigit);
            }
        }
//        System.out.println(lastDigit);
    }
}
