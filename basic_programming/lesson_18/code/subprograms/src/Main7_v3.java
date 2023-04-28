public class Main7_v3 {

    // написать функцию, которая определяет, является ли число простым (prime)
    // простое число - это число, которое делится нацело на самого себя и на 1 и больше ни на что
    // любое число делится нацело на самого себя и на 1
    // простые числа: 11, 13, 113, 17
    // непростое: 22 (делится 11, 2), 169 (делится на 13), 42 (делится на 6, 7, 3)

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        // 113
        // 113 делим на 2,3,4,5,6,7,8,9,10 пока бы не нашли
        // проверяем до квадратного корня из числа
        // x / y = 2

        // 169
        // единственный делитель - 13
        // 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 13
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12

    public static void main(String[] args) {
        System.out.println(isPrime(2));   // true
        System.out.println(isPrime(7));   // true
        System.out.println(isPrime(21));  // false
        System.out.println(isPrime(121)); // false
        System.out.println(isPrime(169)); // false
        System.out.println(isPrime(113)); // true
    }
}
