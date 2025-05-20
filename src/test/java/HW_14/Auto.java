package HW_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Auto {
    public static WebDriver driver;
    public static MtsMainPage mtsMainPage;
    public static final String URL ="http://mts.by";
    static String PhoneNumber = "297777777";
    static String Summ = "10";
    static String Email = "123@test.ru";

    @BeforeAll
    public static void setup(){
        driver= WebDriverManager.chromedriver().create();
        mtsMainPage = new MtsMainPage(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mtsMainPage.clickAccept();
    }


    @Test
    @DisplayName("Проверка названия блока")
    public void CheckBlockTitleName(){
        driver.findElement(mtsMainPage.BlockTitle);
        Assertions.assertEquals("Онлайн пополнение без комиссии","Онлайн пополнение без комиссии");
    }

    @Test
    @DisplayName("Проверка платежных логотипов")
    public void CheckPayImg(){
        mtsMainPage.imgVisa();
        mtsMainPage.imgVerifiedVisa();
        mtsMainPage.imgMasterCard();
        mtsMainPage.imgMasterCard();
    }

    @Test
    @DisplayName("Переход по ссылке")
    public void linkServ(){
        mtsMainPage.aboutServ();
        driver.get(URL);
    }

    @Test
    @DisplayName("Заполнение полей и прожатие кнопки")
    public void fillInField(){
        mtsMainPage.fillInPhoneField(PhoneNumber);
        mtsMainPage.fillInSumField(Summ);
        mtsMainPage.fillInEmailField(Email);
        mtsMainPage.clickBtn();
    }

    @AfterAll
    public static void quit(){
        driver.quit();
    }
}
