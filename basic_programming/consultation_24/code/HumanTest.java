import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void setAgeForCorrectValue() {
        Human human = new Human();

        human.setAge(5);

        assertEquals(5, human.getAge());
    }

    @Test
    public void setAgeForCorrectValue2() {
        Human human = new Human();

        human.setAge(100);

        assertEquals(100, human.getAge());
    }

    @Test
    public void setAgeForIncorrectValue() {
        Human human = new Human();

        assertThrows(IllegalArgumentException.class, () -> human.setAge(-10));
    }

    @Test
    public void compareToLessThen() {
        Human a = new Human();
        a.setAge(5);

        Human b = new Human();
        b.setAge(10);

        assertTrue(a.compareTo(b) < 0);
    }

    @Test
    public void compareToEqual() {
        Human a = new Human();
        a.setAge(5);

        Human b = new Human();
        b.setAge(5);

        assertEquals(0, a.compareTo(b));
    }

    @Test
    public void compareToGreaterThan() {
        Human a = new Human();
        a.setAge(10);

        Human b = new Human();
        b.setAge(5);

        assertTrue(a.compareTo(b) > 0);
    }
}