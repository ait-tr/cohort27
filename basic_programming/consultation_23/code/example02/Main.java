package example02;

/**
 * 8/3/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        MathUtil mathUtil = new MathUtil();

        System.out.println(mathUtil.isPrime(2)); // true
        System.out.println(mathUtil.isPrime(3)); // true
        System.out.println(mathUtil.isPrime(113)); // true
        System.out.println(mathUtil.isPrime(169)); // false
        System.out.println(mathUtil.isPrime(-10)); // exception
    }
}
