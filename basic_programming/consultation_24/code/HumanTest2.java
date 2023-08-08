import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("Human is works:")
class HumanTest2 {

    @DisplayName("setAge() is works:")
    @Nested
    class TestsForSetAge {
        @ParameterizedTest(name = "all ok for {0}")
        @ValueSource(ints = {0, 100, 5})
        public void for_correct_value(int age) {
            Human human = new Human();

            human.setAge(age);

            assertEquals(age, human.getAge());
        }

        @ParameterizedTest(name = "throws exception for {0}")
        @ValueSource(ints = {-1, 101})
        public void for_age_incorrect_value(int age) {
            Human human = new Human();

            assertThrows(IllegalArgumentException.class, () -> human.setAge(age));
        }
    }

    @DisplayName("compareTo() is works:")
    @Nested
    class TestsForCompareTo {
        @Test
        public void return_negative_when_less_then() {
            Human a = new Human();
            a.setAge(5);

            Human b = new Human();
            b.setAge(10);

            assertTrue(a.compareTo(b) < 0);
        }

        @Test
        public void return_zero_when_equal() {
            Human a = new Human();
            a.setAge(5);

            Human b = new Human();
            b.setAge(5);

            assertEquals(0, a.compareTo(b));
        }

        @Test
        public void return_positive_when_greater_then() {
            Human a = new Human();
            a.setAge(10);

            Human b = new Human();
            b.setAge(5);

            assertTrue(a.compareTo(b) > 0);
        }
    }

}