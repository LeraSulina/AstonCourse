import Lesson_16_testng.Triangle;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TriangleTest {
    @Test(description = "Square Triangle Test", dataProvider = "val")
    public void squareTriangleTest(double a, double h, double expected) {
        Assertions.assertEquals(Triangle.getSTriangle(a,h), expected);
    }


    @DataProvider
    public Object[][] val(){
        return new Object[][]{
                {1, 5, Triangle.getSTriangle(1,5)},
                {2, 4, Triangle.getSTriangle(2,4)},
                {-1, 5, Triangle.getSTriangle(-1,5)},
                {1, 0, Triangle.getSTriangle(1,0)},
                {-1, -2, Triangle.getSTriangle(-1,-2)},
        };
    }

}
