package HW_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MtsMainPageTest_HW13 {
    public static WebDriver driver;
    public static MtsMainPage_HW13 mtsMainPage;
    public static final String URL ="http://mts.by";
    static String PhoneNumber = "297777777";
    static String Summ = "10";
    static String Email = "123@test.ru";

    @BeforeAll
    public static void setup(){
        driver= WebDriverManager.chromedriver().create();
        mtsMainPage = new MtsMainPage_HW13(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mtsMainPage.clickAccept();
    }


    @Test
    @DisplayName("Проверка названия блока")
    public void CheckBlockTitleName(){
        Assertions.assertEquals("Онлайн пополнение без комиссии",mtsMainPage.getBlockTitleName());
        System.out.println("Названия блока соответсвует: " + mtsMainPage.getBlockTitleName());
    }

    @Test
    @DisplayName("Проверка платежных логотипов")
    public void CheckPayImg(){
        mtsMainPage.imgVisa();
        mtsMainPage.imgVerifiedVisa();
        mtsMainPage.imgMasterCard();
        mtsMainPage.imgMasterCard();
        System.out.println("Логотипы отображены");
    }

    @Test
    @DisplayName("Переход по ссылке")
    public void linkServ(){
        mtsMainPage.aboutServ();
        driver.get(URL);
        System.out.println("Переход по ссылке происходит");
    }

    @Test
    @DisplayName("Заполнение полей и прожатие кнопки")
    public void fillInField(){
        mtsMainPage.fillInPhoneField(PhoneNumber);
        mtsMainPage.fillInSumField(Summ);
        mtsMainPage.fillInEmailField(Email);
        mtsMainPage.clickBtn();
        System.out.println("Поля заполнены, кнопка нажата");
    }

    @AfterAll
    public static void quit(){
        driver.quit();
    }
}
