import Lesson_16_junit_5.Sravnenie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SravnenieTest {
    @DisplayName("Тест Сравнение чисел")
    @ParameterizedTest
    @CsvSource({"1, 1, true", "-1, 3, false", "-1, -2, false"})
    public void Difference(int m, int n, boolean f){
        Assertions.assertEquals(Sravnenie.srav(m, n), f);
    }
}
