import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestMtsPayFrame {
    public static WebDriver driver;
    public static MtsMainPage mtsMainPage;
    public static MtsPayFramee mtsPayFrame;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        mtsMainPage.clickAccept();
        mtsMainPage.fillInPhoneField(PhoneNumber);
        mtsMainPage.fillInSumField(Summ);
        mtsMainPage.fillInEmailField(Email);
        mtsMainPage.clickBtn();
        mtsPayFrame = new MtsPayFramee(driver, mtsMainPage.mtsPayFram);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Проверка суммы поплнения в описании оплаты")
    public void CheckSummCost(){
        Assertions.assertEquals(Summ+" BYN", mtsPayFrame.getCountSumm());
        System.out.println("Текст суммы совпадает: " + mtsPayFrame.getCountSumm());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Проверка суммы на кнопке")
    public void CheckSummOnBtn(){
        Assertions.assertEquals("Оплатить " + Summ + " BYN", mtsPayFrame.getSummOnBtn());
        System.out.println("Текст кнопки совпадает: " + mtsPayFrame.getSummOnBtn());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Проверка номера телефона в описании оплаты")
    public void CheckNumberCost(){
        Assertions.assertEquals("Оплата: Услуги связи Номер:375" + PhoneNumber, mtsPayFrame.getNumberCost());
        System.out.println("Номер телефона в заголовке совпадает: " + mtsPayFrame.getNumberCost());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Проверка Плейсхолдеров")
    public void getPlaceHolder (){
        mtsPayFrame.getCartNumber();
        mtsPayFrame.getValPer();
        mtsPayFrame.getCVC();
        mtsPayFrame.getFirstLastName();
        System.out.println("Плейсхолдеры совпадают");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Проверка логотипов платежных систем")
    public void CheckImgPay(){
        mtsPayFrame.imgPayVisa();
        mtsPayFrame.imgPay();
        mtsPayFrame.imgPayMasterCard();
        mtsPayFrame.imgPayBelCart();
        System.out.println("Логотипы отображены");
    }

    @AfterAll
    public static void quit(){
        driver.quit();
    }
}
