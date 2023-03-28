import java.util.Scanner;

public class Task09Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(1);
        char c = scanner.next().charAt(2);

        // определяем алфавит
        // 0 .. 25 - большие буквы англ алфавита, 65 - 90, прибавить 65 - получите ASCII
        // 26 .. 51 - маленькие буквы англ алфавита, 97 - 122, прибавить 71 - получите ASCII
        // 52 .. 61 - цифры, 48 - 57, отнять 3, получим ASCII
        // 62, 63 - +, /

        // получить двоичные представления каждого из чисел

        // a -> 01001101
        // b -> 01100001
        // c -> 01101110

        int code1 = 1001101;
        int code2 = 1100001;
        int code3 = 1101110;

        // проблема, теряются нули в int
        boolean containsZero1 = true;
        boolean containsZero2 = true;
        boolean containsZero3 = true;

        // нужно сделать склеивание, long - 19, нужно хранить 24
        long part1 = 100110101100001L;
        long part3 = 1101110;

        // part1 = code1 + 0 + code2
        // part3 = code3

        // [010011][010110][0001 01][101110]
        int base64_1 = 010011;
        int base64_2 = 010110;
        int base64_3 = 000101;
        int base64_4 = 101110;

        boolean containsZeroBase1 = true;
        boolean containsZeroBase2 = true;
        boolean containsZeroBase3 = true;
        boolean containsZeroBase4 = false;

        // преобразовать bas-ы в символы АЛФАВИТА, Алфавит можно получить из ASCII

        // sum1 = code1 + 0 + code2 // 2101102
        // sum1 = code1 * 100000 + code2;
    }
}
