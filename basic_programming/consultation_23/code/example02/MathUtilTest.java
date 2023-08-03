package example02;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class MathUtilTest {

    private MathUtil mathUtil;

    @BeforeEach
    public void setUp() { // вызывается при каждом тесте
        this.mathUtil = new MathUtil(); // создаем объект, который будем тестировать
    }

    @ParameterizedTest(name = "return <true> on number: {0}")
    @ValueSource(ints = {2, 3})
    public void test_on_simple_numbers(int simpleNumber) {
        assertTrue(mathUtil.isPrime(simpleNumber));
    }

    @ParameterizedTest(name = "return <true> on number: {0}")
    @ValueSource(ints = {113, 43})
    public void test_on_prime_numbers(int primeNumber) {
        assertTrue(mathUtil.isPrime(primeNumber));
    }

    @ParameterizedTest(name = "return <false> on number: {0}")
    @ValueSource(ints = {21, 169, 121, 56})
    public void test_on_composite_numbers(int compositeNumber) {
        assertFalse(mathUtil.isPrime(compositeNumber));
    }

    @ParameterizedTest(name = "throw exception on number: {0}")
    @ValueSource(ints = {-1, 0, 1})
    public void test_on_bad_numbers(int badNumber) {
        assertThrows(IllegalArgumentException.class, () -> mathUtil.isPrime(badNumber));
    }
}