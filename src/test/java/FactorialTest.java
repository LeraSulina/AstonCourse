import Lesson_16_testng.Factorial;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test(description = "Factorial Tests", dataProvider = "val" )
    public void FactorialTest(int input, long expected){
        Assertions.assertEquals(Factorial.getFactorial(input), expected);
    }


    @DataProvider
    public Object[][] val(){
            return new Object[][]{
                    {1, Factorial.getFactorial(1)},
                    {5, Factorial.getFactorial(5)},
                    {18, Factorial.getFactorial(18)},
                    {-1, Factorial.getFactorial(-1)},
            };
    }
}
