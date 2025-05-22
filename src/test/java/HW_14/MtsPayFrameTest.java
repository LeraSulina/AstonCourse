package HW_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MtsPayFrameTest {
    public static WebDriver driver;
    public static MtsMainPage_HW13 mtsMainPage;
    public static MtsPayFrame mtsPayFrame;
    public static final String URL ="http://mts.by";
    static String PhoneNumber = "297777777";
    static String Summ = "10.11";
    static String Email = "123@test.ru";

    @BeforeAll
    public static void setup() {
        driver = WebDriverManager.chromedriver().create();
        mtsMainPage = new MtsMainPage_HW13(driver);
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
    public void CheckSummCost(){
        Assertions.assertEquals(Summ+" BYN", mtsPayFrame.getCountSumm());
        System.out.println("Текст суммы совпадает: " + mtsPayFrame.getCountSumm());
    }

    @Test
    @DisplayName("Проверка суммы на кнопке")
    public void CheckSummOnBtn(){
        Assertions.assertEquals("Оплатить " + Summ + " BYN", mtsPayFrame.getSummOnBtn());
        System.out.println("Текст кнопки совпадает: " + mtsPayFrame.getSummOnBtn());
    }

    @Test
    @DisplayName("Проверка номера телефона в описании оплаты")
    public void CheckNumberCost(){
        Assertions.assertEquals("Оплата: Услуги связи Номер:375" + PhoneNumber, mtsPayFrame.getNumberCost());
        System.out.println("Номер телефона в заголовке совпадает: " + mtsPayFrame.getNumberCost());
    }

    @Test
    @DisplayName("Проверка Плейсхолдеров")
    public void getPlaceHolder (){
        mtsPayFrame.getCartNumber();
        mtsPayFrame.getValPer();
        mtsPayFrame.getCVC();
        mtsPayFrame.getFirstLastName();
        System.out.println("Плейсхолдеры совпадают");
    }

    @Test
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
