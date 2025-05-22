import Lesson_16_testng.Sravnenie;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SravnenieTest {
    @Test(description = "Сравнение чисел", dataProvider = "val")
    public void Difference(int m, int n, boolean f){
        Assertions.assertEquals(Sravnenie.srav(m, n), f);
    }

    @DataProvider
    public Object[][] val (){
        return new Object[][]{
                {1, 1, true},
                {-1, 3, false},
                {-1, -1, true},
                {-1, -2, false}
        };
    }
}
