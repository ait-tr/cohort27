public class Main1 {

    // 25-ая группа
    // 19-й урок, шаблон решения заданий с разбором

    // вернуть позицию первого вхождения символа c в строку text
    // String text = Hello!
    // char c = 'l'
    // indexOf(text, c) -> 2
    // если символ в тексте не найден, то необходимо вернуть -1
    public static int indexOf(String text, char c) {
        // получаем строку в виде массива символов
        // необходимо пробежать все элементы массива и сравнить с символом, который мы ищем
        for (int i = 0; i < text.length(); i++) {
            // если искомый символ совпадает с текущим (i-ым) символом строки
            if (c == text.charAt(i)) {
                // возвращаем позицию, где встретили этот самый искомый символ
                return i; // выход с результатом i
            }
        }
        // если ни разу не нашли
        // возвращаем -1
        return -1; // выход с результатом -1
    }

    public static int getIndexOfMin(int[] array) {
        return -1;
    }

    public static int getIndexOfMax(int[] array) {
        return -1;
    }

    // копия с минимальным и максимальным, которые поменялись местами
    public static int[] copyWithMinMaxSwap(int[] array) {
        // создаете копию этого массива

        // создаете массив такой же длины
        int[] copyArray = new int[array.length];

        // нужно скопировать все элементы массива array в массив copyArray
        // в цикле поэлементно

        int indexOfMax = getIndexOfMax(copyArray);
        int indexOfMin = getIndexOfMin(copyArray);
        // найти минимальный и максимальный, но уже в copyArray
        // поменять их местами в copyArray
        // вернуть copyArray
        return copyArray;
    }

    public static void main(String[] args) {
        String hello = "Hello!";
        int result = indexOf(hello, 'c');
    }
}
