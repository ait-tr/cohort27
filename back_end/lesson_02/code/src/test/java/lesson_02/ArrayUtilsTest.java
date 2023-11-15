package lesson_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    private ArrayUtils utils;

    // 1. Определяем, какое значение мы ожидаем от метода
    // в случае, если мы туда передадим определённый параметр
    // 2. Вызываем наш метод с выбранным значением параметра.
    // 3. Проверяем, а действительно ли наш метод вернул ожидаемый результат,
    // или результат отличается от того, что мы ожидаем, т.е. результат неверны.
    // 4. Если ожидание совпадает с реальностью - тест пройден. Если нет - тест не пройден.

    private int[] array;

    @BeforeEach
    public void init() {
        utils = new ArrayUtils();
        array = utils.getArrayBySize(5);
    }

    @AfterEach
    public void finish() {
        System.out.println();
    }

    // Тестовые сценарии:
    // 1. Вызываем наш метод, передавая туда параметр 5.
    //    Ожидаем, что наш метод вернёт нам массив размером 5.
    //    Вызываем наш метод и проверяем длину полученного массива.
    //    Если она равна 5, то тест пройден. Иначе - нет.

    @Test
    public void checkIfArrayLengthIsCorrect() {
        int expected = 5;
        int actual = array.length;
        assertEquals(expected, actual);
    }

    // 2. Передаём в метод параметр, при котором наш метод должен
    //    выбрасывать исключение.
    //    Ожидаем это исключение. Если оно выбрасывается - тест пройден.
    //    Если нет - тест не пройден.

//    @Test(expected = IllegalArgumentException.class)
//    public void expectExceptionIfArgumentIsIncorrect() {
//        utils.getArrayBySize(0);
//    }

    @Test
    public void expectExceptionIfArgumentIsIncorrect() {
        try {
            utils.getArrayBySize(0);
        } catch (IllegalArgumentException e) {
            return;
        }
        fail();
    }

    // 3. Передаём в метод корректный параметр, например, 5.
    //    Ожидаем, что нам вернётся массив, содержащий значения 1, 2, 3, 4, 5
    //    Можем точечно проверить одно-два-три значения внутри массива.

    @Test
    public void checkIfArrayContainsCorrectValues() {
        int expected1 = 2;
        int expected2 = 4;
        int actual1 = array[1];
        int actual2 = array[3];
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    // 4. Проверяем, не возвращает ли нам метод null вместо ожидаемого массива.

    @Test
    public void checkIfReturnedArrayIsNotNull() {
        assertNotNull(array);
    }
}