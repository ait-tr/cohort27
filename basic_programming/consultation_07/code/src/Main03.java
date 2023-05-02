public class Main03 {
    // написать функцию, которая проверяет, есть ли в слове хотя бы одна большая буква
    // если есть - возвращает true
    // если нет - false
    public static boolean containsCapitalLetter(String word) {
        // преобразовать слово в массив char
        char[] characters = word.toCharArray();
        // пробежим все элементы этого массива
        for (int i = 0; i < characters.length; i++) {
            // проверим, является ли i-ая буква большой - буква в диапазоне от A до Z
            if (isCapitalLetter(characters[i])) {
                // раз мы нашли большую букву, то можем сразу остановить функцию с результатом true
                return true;
            }
        }
        // если мы не нашли ни одной большой буквы, то мы ни разу не зашли в return true
        return false;
    }

    public static boolean isCapitalLetter(char character) {
        return character >= 'A' && character <= 'Z';  // true, false
    }

    public static void main(String[] args) {
        String s1 = "hello"; // false
        String s2 = "bYe"; // true

        boolean b1 = containsCapitalLetter(s1);

        System.out.println(b1);
        System.out.println(containsCapitalLetter(s2));
    }
}
