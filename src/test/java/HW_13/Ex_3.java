package HW_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex_3 {
    private static WebDriver driver;


    @BeforeAll
    static void setup(){
        driver= WebDriverManager.chromedriver().create();
        driver.get("http://mts.by");
        driver.findElement(By.className("cookie__buttons"));
        WebElement cookieYes = driver.findElement(By.id("cookie-agree"));
        cookieYes.click();
    }


    @DisplayName("Подробнее о сервисе")
    @Test
    public void aboutServ(){
        WebElement aboutServ = driver.findElement(By.linkText("Подробнее о сервисе"));
        aboutServ.click();
        System.out.println("Ссылка работает");
    }
    @AfterAll
    public static void close(){
        driver.close();
    }


}
