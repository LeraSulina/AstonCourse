import Lesson_16_junit_5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTest {
    @DisplayName("Арифметические действия: Сложение")
    @ParameterizedTest
    @CsvSource({"1, 1, 2", "-1, 2, 1", "1, 0, 1", "2, -3, -1", "2.45, 0.5, 2.95"})
    public void Summ(double b, double c, double d) {
        Assertions.assertEquals(Calc.getSumm(b, c), d);
    }

    @DisplayName("Арифметические действия: Вычетание")
    @ParameterizedTest
    @CsvSource({"1, 1, 0", "-1, 2, -3", "1, 0, 1", "2, -3, 5", "2.5, 0.5, 2"})
    public void Diff(double b, double c, double d) {
        Assertions.assertEquals(Calc.getDifference(b, c), d);
    }

    @DisplayName("Арифметические действия: Деление")
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "-1, 2, -0.5", "1, 0, 0", "6, -3, -2", "2.5, 0.5, 5"})
    public void Div(double b, double c, double d) {
        Assertions.assertEquals(Calc.getDivision(b, c), d);
    }

    @DisplayName("Арифметические действия: Умножение")
    @ParameterizedTest
    @CsvSource({"1, 1, 1", "-1, 2, -2", "1, 0, 0", "6, -3, -18", "2.5, 0.5, 1.25"})
    public void Mult(double b, double c, double d) {
        Assertions.assertEquals(Calc.getMultiplication(b, c), d);
    }
}
