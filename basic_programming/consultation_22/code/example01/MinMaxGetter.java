package example01;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MinMaxGetter {
    /**
     * Находит минимальный элемент в массиве чисел
     * @param array массив, который мы подаем на вход
     * @return минимальный элемент, который есть в массиве
     */
    public static int min(int[] array) {
        int min = array[0]; // предполагаем, что самый минимальный элемент, это первый, который мы посмотрели

        // идем дальше, ищем "еще минимальнее"
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) { // проверяем, а не меньше ли текущий (i-ый) элемент того, который был до этого
                // если он оказался меньше
                min = array[i]; // теперь текущий стал минимальным
            }
        }
        // как только прошел весь цикл, в min у нас будет минимальный элемент
        return min;
    }

    public static Human minAgeHuman(Human[] humans) {
        Human min = humans[0];

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getAge() < min.getAge()) {
                min = humans[i];
            }
        }

        return min;
    }
}
