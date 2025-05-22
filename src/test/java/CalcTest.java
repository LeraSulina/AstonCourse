import Lesson_16_testng.Calc;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {

    @Test(description = "Сложение", dataProvider = "summ")
    public void Summ(double b, double c, double d) {
        Assertions.assertEquals(Calc.getSumm(b, c), d);
    }

    @Test(description = "Вычетание", dataProvider = "diff")
    public void Diff(double b, double c, double d) {
        Assertions.assertEquals(Calc.getDifference(b, c), d);
    }

    @Test(description = "Деление", dataProvider = "divv")
    public void Div(double b, double c, double d) {
        Assertions.assertEquals(Calc.getDivision(b, c), d);
    }

    @Test(description = "Умножение", dataProvider = "mult")
    public void Mult(double b, double c, double d) {
        Assertions.assertEquals(Calc.getMultiplication(b, c), d);
    }

    @DataProvider (name = "summ")
    public Object[][] summ (){
        return new Object[][]{
                {1, 1, 2},
                {-1, 2, 1},
                {2.45, 0.5, 2.95}
        };
    }

    @DataProvider (name = "diff")
    public Object[][] diff (){
        return new Object[][]{
                {1, 1, 0},
                {-1, 2, -3},
                {2, -3, 5},
                {2.5, 0.5, 2}
        };
    }

    @DataProvider(name = "divv")
    public Object[][] divv (){
        return new Object[][]{
                {1, 1, 1},
                {-1, 2, -0.5},
                {1, 0, 0},
                {-6, -3, 2},
                {2.5, 0.5, 5}
        };
    }

    @DataProvider(name = "mult")
    public Object[][] mult(){
        return new Object[][]{
                {1, 1, 1},
                {-1, 2, -2},
                {1, 0, 0},
                {6, -3, -18},
                {2.5, 0.5, 1.25}
        };
    }

}

