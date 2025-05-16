package HW_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex_1and2 {

    private static WebDriver driver;


    @BeforeAll
    static void setup(){
    driver= WebDriverManager.chromedriver().create();
    driver.get("http://mts.by");
    driver.findElement(By.className("cookie__buttons"));
    WebElement cookieYes = driver.findElement(By.id("cookie-agree"));
    cookieYes.click();
    }

    @DisplayName("Проверка названия указанного блока")
    @Test
    public void findBlockTitle(){
    WebElement blockTitle= driver.findElement(By.xpath("//h2[(text()='Онлайн пополнение ')]"));
    Assertions.assertTrue(blockTitle.isDisplayed());
    }

    @DisplayName("Проверка наличия логотипов платежных систем, Visa")
    @Test
    public void checkImgPayVisa(){
    WebElement visa = driver.findElement(By.xpath("//img[contains(@alt, 'Visa')]"));
    Assertions.assertTrue(visa.isDisplayed());
    }

    @DisplayName("Проверка наличия логотипов платежных систем, Visa_Verified")
    @Test
    public void  checkImgPayVisaVerified(){
    WebElement visaVerified = driver.findElement(By.xpath("//img[contains(@alt, 'Verified By Visa')]"));
    Assertions.assertTrue(visaVerified.isDisplayed());
    }

    @DisplayName("Проверка наличия логотипов платежных систем, MasterCard")
    @Test
    public void  checkImgPayMasterCard(){
    WebElement masterCard = driver.findElement(By.xpath("//img[contains(@alt, 'MasterCard')]"));
    Assertions.assertTrue(masterCard.isDisplayed());
    }

    @DisplayName("Проверка наличия логотипов платежных систем, Белкарт")
    @Test
    public void  checkImgPayBelCard(){
    WebElement belCard = driver.findElement(By.xpath("//img[contains(@alt, 'Белкарт')]"));
    Assertions.assertTrue(belCard.isDisplayed());
    }


    @AfterAll
    public static void close(){
        driver.close();
    }
}
