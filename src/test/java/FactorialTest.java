import Lesson_16_junit_5.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialTest {

    @DisplayName("Тест факториала")
    @ParameterizedTest
    @CsvSource({"0, 1", "5, 120", "10, 3628800", "18, 6402373705728000", "-1, 0"})
    public void factorialTest(int a, long x) {
        Assertions.assertEquals(Factorial.getFactorial(a), x);
    }
}
