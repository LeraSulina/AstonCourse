import Lesson_16_junit_5.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {
    @DisplayName("Тест площади треугольника")
    @ParameterizedTest
    @CsvSource({"1, 5, 2.5", "2, 4, 4", "2, 5, 5", "-1, 5, 0", "1, 0, 0", "-1, -2, 0"})
    public void squareTriangleTest(double a, double h, double square) {
        Assertions.assertEquals(Triangle.getSTriangle(a, h), square);
    }
}
