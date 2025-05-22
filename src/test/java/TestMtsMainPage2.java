import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class TestMtsMainPage2 {
    public static WebDriver driver;
    public static MtsMainPage2 mtsMainPage2;
    public static MtsMainPage mtsMainPage;
    public static final String URL ="http://mts.by";

    @BeforeAll
    public static void setup(){
        driver= WebDriverManager.chromedriver().create();
        mtsMainPage2 = new MtsMainPage2(driver);
        mtsMainPage = new MtsMainPage(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        mtsMainPage.clickAccept();
    }

    @Test
    @DisplayName("Выбор варианта оплаты 'Услуги связи' и проверка пелйсхолдеров полей")
    public void getConnPlaceholder(){
        mtsMainPage2.selectConnServ();
        mtsMainPage2.getConnServPlaceholderPhone();
        mtsMainPage2.getConnPlaceholderSumm();
        mtsMainPage2.getConnPlaceholderEmail();
        System.out.println("Плейсхолдеры варианта оплаты 'Услуги связи' совпадают");
    }

    @Test
    @DisplayName("Выбор варианта оплаты 'Домашний интнернет' и проверка плейсхолдеров полей")
    public void getHomeInternetPlaceholder(){
        mtsMainPage2.selectHomeInternet();
        mtsMainPage2.getHomePlaceholderPhone();
        mtsMainPage2.getHomePlaceholderSumm();
        mtsMainPage2.getHomePlaceholderEmail();
        System.out.println("Плейсхолдеры варианта оплаты 'Домашний интернет' совпадают");
    }

    @Test
    @DisplayName("Выбор варианта оплаты 'Рассрочка' и проверка плейсхолдеров полей")
    public void getInstPlanePlaceholder(){
        mtsMainPage2.selectInstPlane();
        mtsMainPage2.getInstPlaneAccNumber();
        mtsMainPage2.getInstPlaneSumm();
        mtsMainPage2.getInstPlaneEmail();
        System.out.println("Плейсхолдеры варианта оплаты 'Рассрочка' совпадают");
    }

    @Test
    @DisplayName("Выбор варианта оплаты 'Задолжность' и проверка плейсхолдеров полей")
    public void getDebtPlaceholder(){
        mtsMainPage2.selectDebt();
        mtsMainPage2.getDebtAccNumber();
        mtsMainPage2.getDebtSumm();
        mtsMainPage2.getDebtEmail();
        System.out.println("Плейсхолдеры варианта оплаты 'Задолженность' совпадают");
    }
}

