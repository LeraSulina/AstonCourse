package HW_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Ex_4 {
    private static WebDriver driver;


    @BeforeAll
    static void setup(){
        driver= WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://mts.by");
        driver.findElement(By.className("cookie__buttons"));
        WebElement cookieYes = driver.findElement(By.id("cookie-agree"));
        cookieYes.click();
    }

    @DisplayName("Заполнение поля и проверка работы кнопки")
    @Test
    public void sendPhoneNumber() {
        WebElement phoneNumber = driver.findElement(By.id("connection-phone"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");
        WebElement button = driver.findElement(By.className("button__default"));
        button.click();
    }

    @AfterAll
    public static void close(){
        driver.close();
    }
}
