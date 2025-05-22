import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MtsMainPage {
    public WebElement mtsPayFram;
    By CookiesLocator = By.id("cookie-agree");

    By BlockTitle = By.xpath("//*[@class='pay__wrapper']/h2");

    By imgPayVisa = By.xpath("//section/div/div[2]/ul/li[1]/img");
    By imgPayVerifiedVisa = By.xpath("//section/div/div[2]/ul/li[2]/img");
    By imgPayMasterCard = By.xpath("//section/div/div[2]/ul/li[4]/img");
    By imgPayBelcart = By.xpath("//section/div/div[2]/ul/li[5]/img");

    By aboutServLink = By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");

    By phoneNumberField = By.id("connection-phone");
    By sumField = By.id("connection-sum");
    By emailField = By.id("connection-email");

    By continueBtn = By.xpath("//*[@id=\"pay-connection\"]/button");
    public final WebDriver driver;

    public MtsMainPage(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * Принять куки
     */
    public MtsMainPage clickAccept(){
        driver.findElement(CookiesLocator).click();
        return this;
    }
    public String getBlockTitleName(){
        WebElement BlockTitleName = driver.findElement(BlockTitle);
        return BlockTitleName.getText().replaceAll("\n|\r\n", " ");
    }
    /**
     *Проверка логотипа платежной системы Visa
     */
    public MtsMainPage imgVisa(){
        WebElement Visa = driver.findElement(imgPayVisa);
        Assertions.assertTrue(Visa.isDisplayed());
        return this;
    }
    /**
     *Проверка логотипа платежной системы Verified_Visa
     */
    public MtsMainPage imgVerifiedVisa(){
        WebElement VerifiedVisa = driver.findElement(imgPayVerifiedVisa);
        Assertions.assertTrue(VerifiedVisa.isDisplayed());
        return this;
    }
    /**
     *Проверка логотипа платежной системы MasterCard
     */
    public MtsMainPage imgMasterCard(){
        WebElement MasterCard = driver.findElement(imgPayMasterCard);
        Assertions.assertTrue(MasterCard.isDisplayed());
        return this;
    }
    /**
     *Проверка логотипа платежной системы Белкарт
     */
    public MtsMainPage imgBelcart(){
        WebElement Belcart = driver.findElement(imgPayBelcart);
        Assertions.assertTrue(Belcart.isDisplayed());
        return this;
    }
    /**
     *Переход по ссылке "Подробнее о сервисе"
     */
    public MtsMainPage aboutServ(){
        driver.findElement(aboutServLink).click();
        return this;
    }
    /**
     *Заполнить поле "Номер телефона"
     */
    public MtsMainPage fillInPhoneField(String PhoneNumber){
        driver.findElement(phoneNumberField).click();
        driver.findElement(phoneNumberField).sendKeys(PhoneNumber);
        return this;
    }
    /**
     *Заполнить поле "Сумма"
     */
    public MtsMainPage fillInSumField (String Summ){
        driver.findElement(sumField).click();
        driver.findElement(sumField).sendKeys(Summ);
        return this;
    }
    /**
     *Заполнить поле "Email"
     */
    public MtsMainPage fillInEmailField (String Email){
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(Email);
        return this;
    }
    /**
     *Кликнуть на кнопку "Продолжить"
     */
    public MtsMainPage clickBtn (){
        driver.findElement(continueBtn).click();
        return this;
    }
}
