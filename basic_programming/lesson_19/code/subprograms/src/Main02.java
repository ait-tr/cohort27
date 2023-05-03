public class Main02 {


    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // распечатать все простые числа от from до to
    public static void printAllPrimesInRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            // в b кладем результат проверки - простое число или нет
            boolean b = isPrime(i); // b = true -> когда i - простое, false - когда не простое
            // если в b лежит true, то можно печатать
            if (b == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(113)); // true
//        System.out.println(isPrime(121)); // false -> 11
//        System.out.println(isPrime(17)); // true
//        System.out.println(isPrime(20)); // false -> 2, 10
//        System.out.println(isPrime(55)); // false -> 5, 11

        printAllPrimesInRange(10, 100);
        printAllPrimesInRange(200, 230);
    }
}
