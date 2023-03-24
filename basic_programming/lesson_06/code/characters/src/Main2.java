package characters;

public class Main2 {
    public static void main(String[] args) {
        // символ 0 - 48
        char c = '1'; // 49
        // отнимаем код нуля, потому что разница между цифрой и нулем = значению цифры
        int number = c - '0'; // number = 9
        System.out.println((int)'0');
        System.out.println((int)c);
        System.out.println(number);

        // 1. char - числовой тип (от него можно отнимать и прибавлять)
        // 2. цифры в таблице идут друг за другом
    }
}
