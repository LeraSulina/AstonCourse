import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsPayFramee {
    By SummCost = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/div[1]/span");
    By SummOnBtn = By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button");
    By NumberCost = By.xpath("//app-payment-container/section/div/div/div[2]/span");

    By CartNumber = By.xpath("//app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/label");
    By ValPer = By.xpath("//app-card-input/form/div[1]/div[2]/div[1]/app-input/div/div/div[1]/label");
    By CVC = By.xpath("//app-card-input/form/div[1]/div[2]/div[3]/app-input/div/div/div[1]/label");
    By FirstLastName = By.xpath("//app-card-input/form/div[1]/div[3]/app-input/div/div/div[1]/label");

    By imgPayVisa = By.xpath("//app-input/div/div/div[2]/div/div/img[1]");
    By imgPay = By.xpath("//app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/div");
    By imgPayMasterCard = By.xpath("//app-input/div/div/div[2]/div/div/img[2]");
    By imgPayBelCart = By.xpath("//app-input/div/div/div[2]/div/div/img[3]");

    public final WebDriver driver;
    public MtsPayFramee(WebDriver driver, WebElement frameLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[8]/div/iframe")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname=creditCard] + label")));

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /**
     * Получение Суммы из описания оплаты
     */
    public String getCountSumm (){
        WebElement actCountSumm = driver.findElement(SummCost);
        return actCountSumm.getText();
    }
    /**
     * Получение номера из описания оплаты
     */
        public String getNumberCost(){
        WebElement actNumberCost = driver.findElement(NumberCost);
        return actNumberCost.getText();
    }
    /**
     * Получение суммы с кнопки "Оплатить"
     */
    public String getSummOnBtn(){
        WebElement actSummOnBtn = driver.findElement(SummOnBtn);
        return actSummOnBtn.getText();
    }
    /**
     * Получение данных заполнения поля "Номер карты"
     */
    public MtsPayFramee getCartNumber(){
        String actCartNumber = driver.findElement(CartNumber).getText();
        Assertions.assertEquals("Номер карты", actCartNumber);
        return this;
    }
    /**
     * Получение данных заполнения поля "Срок действия"
     */
    public MtsPayFramee getValPer (){
        String actValPer = driver.findElement(ValPer).getText();
        Assertions.assertEquals("Срок действия", actValPer);
        return this;
    }
    /**
     * Получение данных заполнения поля "CVC"
     */
    public MtsPayFramee getCVC (){
        String actCVC = driver.findElement(CVC).getText();
        Assertions.assertEquals("CVC", actCVC);
        return this;
    }
    /**
     * Получение данных заполнения поля "Имя и фамилия на карте"
     */
    public MtsPayFramee getFirstLastName(){
        String actFirstLastName = driver.findElement(FirstLastName).getText();
        Assertions.assertEquals("Имя и фамилия на карте", actFirstLastName);
        return this;
    }
    /**
     * Проверка логотипа платежной системы Visa
     */
    public MtsPayFramee imgPayVisa(){
        WebElement Visa = driver.findElement(imgPayVisa);
        Assertions.assertTrue(Visa.isDisplayed());
        return this;
    }
    /**
     * Проверка логотипа платежной системы
     */
    public MtsPayFramee imgPay (){
        WebElement ImgPay = driver.findElement(imgPay);
        Assertions.assertTrue(ImgPay.isDisplayed());
        return this;
    }
    /**
     * Проверка логотипа платежной системы MasterCard
     */
    public MtsPayFramee imgPayMasterCard(){
        WebElement ImgPayMasterCard = driver.findElement(imgPayMasterCard);
        Assertions.assertTrue(ImgPayMasterCard.isDisplayed());
        return this;
    }
    /**
     * Проверка логотипа платежной системы Белкарт
     */
    public MtsPayFramee imgPayBelCart(){
        WebElement ImgPayBelCart = driver.findElement(imgPayBelCart);
        Assertions.assertTrue(ImgPayBelCart.isDisplayed());
        return this;
    }
}
