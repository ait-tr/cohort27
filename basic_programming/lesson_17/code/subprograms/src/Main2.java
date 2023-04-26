package subprograms;

public class Main2 {
    // посчитать сумму чисел в каком-либо диапазоне
    // например [5, 9] -> 5 + 6 + 7 + 8 + 9
    public static int sumInRange(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + i; // 5, 6, 7, 8, 9
        }

        return sum;
    }

    public static void main(String[] args) {
        int result1 = sumInRange(5, 9);
        int result2 = sumInRange(3, 10);
        System.out.println(result1);
        System.out.println(result2);
    }
}
