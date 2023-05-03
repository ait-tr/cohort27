public class Main03 {
    // написать функцию, которая возвращает true, если число четное, false если нечетное
//    public static boolean isEven(int number) {
//        // если число четное
//        if (number % 2 == 0) {
//            // возвращаю true
//            return true;
//        } else {
//            // если нечетное - возвращаю false
//            return false;
//        }
//    }

//    public static boolean isEven(int number) {
//        boolean result = number % 2 == 0; // true, false
//        return result;
//    }

    public static boolean isEven(int number) {
        return number % 2 == 0; // return true, return false
    }

    // распечатать все четные элементы массива
//    public static void printEvenNumbers(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            boolean b = isEven(array[i]); // b - true, когда array[i] - четный
//            // печатаем array[i] только тогда, когда он четный
//            if (b == true) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
//    }

//    public static void printEvenNumbers(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (isEven(array[i]) == true) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
//    }

    public static void printEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // false == true -> false
            // true == true -> true
            if (isEven(array[i])) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {72, 11, 45, 21, 39, 192, 11, 9, 322, 120, 943, 2203, 1};
        printEvenNumbers(a);
    }
}
