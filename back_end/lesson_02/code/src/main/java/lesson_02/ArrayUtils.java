package lesson_02;

// Для создания тестового класса нужно поставить курсор
// на имя этого класса и нажать Alt+Enter,
// выбрать опцию Create Test и нажать OK
public class ArrayUtils {

    // 3 -> [1, 2, 3]
    // 5 -> [1, 2, 3, 4, 5]
    public int[] getArrayBySize(int size) {

        if (size < 1) {
            throw new IllegalArgumentException("Индекс не может быть меньше 1.");
        }

        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}