package HW_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MtsPayFrameAuto {
    public static WebDriver driver;
    public static MtsMainPage mtsMainPage;
    public static MtsPayFrame mtsPayFrame;
    public static final String URL ="http://mts.by";
    static String PhoneNumber = "297777777";
    static String Summ = "10.11";
    static String Email = "123@test.ru";

    @BeforeAll
    public static void setup() {
        driver = WebDriverManager.chromedriver().create();
        mtsMainPage = new MtsMainPage(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mtsMainPage.clickAccept();
        mtsMainPage.fillInPhoneField(PhoneNumber);
        mtsMainPage.fillInSumField(Summ);
        mtsMainPage.fillInEmailField(Email);
        mtsMainPage.clickBtn();
        mtsPayFrame = new MtsPayFrame(driver, mtsMainPage.mtsPayFram);
    }

    @Test
    @DisplayName("Проверка суммы поплнения в описании оплаты")
    public void CheckSummOne(){
        String name = "Текст описания суммы в заголовке";
        try {
            String actValue = mtsPayFrame.getSummCost();
            Assertions.assertEquals(Summ+" BYN", actValue, " не совпадают");
            System.out.println(name+ " совпадает: " + mtsPayFrame.getSummCost());
        } catch (NoSuchElementException e) {
            Assertions.assertTrue(false, "Не найдено");
        }
    }
}
