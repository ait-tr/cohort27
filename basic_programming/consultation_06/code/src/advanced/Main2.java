package advanced;

public class Main2 {
    public static void main(String[] args) {
        // abbbc и abbba
        // abbba < abbbc
        // первые m-символов (4 символа, abbb - совпали)
        // m+1 второго слова (a) меньше чем m+1 первого слова (с)
        if ("Hello".charAt(0) < "Bye".charAt(0)) {
            System.out.println("Yes");
        }
    }
}
