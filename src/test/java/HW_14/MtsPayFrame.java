package HW_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class MtsPayFrame {
    By phoneNumberField = By.id("connection-phone");
    By sumField = By.id("connection-sum");
    By emailField = By.id("connection-email");


    By SummCost = By.cssSelector("div.pay-description__cost span:nth-child(1");
    By SummOnBtn = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button");

    public final WebDriver driver;
    public MtsPayFrame(WebDriver driver, WebElement frameLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname=creditCard] + label")));

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String getSummCost() throws NoSuchElementException {
        return String.valueOf(driver.findElement(SummCost));
    }
}
