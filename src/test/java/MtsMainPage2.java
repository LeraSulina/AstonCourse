import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MtsMainPage2 {

    By accordionBtn = By.xpath("//section/div/div[1]/div[1]/div[2]/button");

    By connServBtn = By.xpath("//section/div/div[1]/div[1]/div[2]/ul/li[1]/p");
    By connPhone = By.id("connection-phone");
    By connSumm = By.id("connection-sum");
    By connEmail = By.id("connection-email");

    By homeInternet = By.xpath("//section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
    By homePhone = By.id("internet-phone");
    By homeSumm = By.id("internet-sum");
    By homeEmail = By.id("internet-email");

    By instPlane = By.xpath("//section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
    By instPlaneAccNumber = By.id("score-instalment");
    By instPlaneSumm = By.id("instalment-sum");
    By instPlaneEmail = By.id("instalment-email");

    By debtBtn = By.xpath("//section/div/div[1]/div[1]/div[2]/ul/li[4]/p");
    By debtAccNumber = By.id("score-arrears");
    By debtSumm = By.id("arrears-sum");
    By debtEmail = By.id("arrears-email");

    String ExpSumm = "Сумма";
    String ExpEmail = "E-mail для отправки чека";

    public final WebDriver driver;

    public MtsMainPage2(WebDriver driver) {
        this.driver = driver;
    }
    /**
     * Выбор варианта оплаты "Услуги связи"
     */
    public MtsMainPage2 selectConnServ(){
        driver.findElement(accordionBtn).click();
        driver.findElement(connServBtn).click();
        System.out.println("Выбран вариант оплаты 'Услуги связи'");
        return this;
    }
    /**
     * Получение плейсходера "Услуги связи" > Номер телефона
     */
    public MtsMainPage2 getConnServPlaceholderPhone(){
        String actPhoneConn = driver.findElement(connPhone).getAttribute("placeholder");
        Assertions.assertEquals("Номер телефона", actPhoneConn);
        return this;
    }
    /**
     * Получение плейсходера "Услуги связи" > Сумма
     */
    public MtsMainPage2 getConnPlaceholderSumm(){
        String actSummConn = driver.findElement(connSumm).getAttribute("placeholder");
        Assertions.assertEquals(ExpSumm, actSummConn);
        return this;
    }
    /**
     * Получение плейсходера "Услуги связи" > Email
     */
    public MtsMainPage2 getConnPlaceholderEmail(){
        String actEmailConn = driver.findElement(connEmail).getAttribute("placeholder");
        Assertions.assertEquals(ExpEmail, actEmailConn);
        return this;
    }
    /**
     * Выбор варианта оплаты "Домашний интнернет"
     */
    public MtsMainPage2 selectHomeInternet(){
        driver.findElement(accordionBtn).click();
        driver.findElement(homeInternet).click();
        System.out.println("Выбран вариант оплаты 'Домашний интернет'");
        return this;
    }
    /**
     * Получение плейсходера "Домашний интернет" > Номер абонента
     */
    public MtsMainPage2 getHomePlaceholderPhone(){
        String actHomePhone = driver.findElement(homePhone).getAttribute("placeholder");
        Assertions.assertEquals("Номер абонента", actHomePhone);
        return this;
    }
    /**
     * Получение плейсходера "Домашний интернет" > Сумма
     */
    public MtsMainPage2 getHomePlaceholderSumm(){
        String actHomeSumm = driver.findElement(homeSumm).getAttribute("placeholder");
        Assertions.assertEquals(ExpSumm, actHomeSumm);
        return this;
    }
    /**
     * Получение плейсходера "Домашний интернет" > Email
     */
    public MtsMainPage2 getHomePlaceholderEmail(){
        String actHomeEmail = driver.findElement(homeEmail).getAttribute("placeholder");
        Assertions.assertEquals(ExpEmail, actHomeEmail);
        return this;
    }
    /**
     * Выбор варианта оплаты "Рассрочка"
     */
    public MtsMainPage2 selectInstPlane(){
        driver.findElement(accordionBtn).click();
        driver.findElement(instPlane).click();
        System.out.println("Выбран вариант оплаты 'Рассрочка'");
        return this;
    }
    /**
     * Получение плейсхолдера "Рассрочка" > Номер счета
     */
    public MtsMainPage2 getInstPlaneAccNumber(){
        String actAccNumber = driver.findElement(instPlaneAccNumber).getAttribute("placeholder");
        Assertions.assertEquals("Номер счета на 44", actAccNumber);
        return this;
    }
    /**
     * Получение плейсхолдера "Рассрочка" > Сумма
     */
    public MtsMainPage2 getInstPlaneSumm(){
        String actInstPlaneSumm = driver.findElement(instPlaneSumm).getAttribute("placeholder");
        Assertions.assertEquals(ExpSumm, actInstPlaneSumm);
        return this;
    }
    /**
     * Получение плейсхолдера "Рассрочка" > Email
     */
    public MtsMainPage2 getInstPlaneEmail (){
        String actInstPlaneEmail = driver.findElement(instPlaneEmail).getAttribute("placeholder");
        Assertions.assertEquals(ExpEmail, actInstPlaneEmail);
        return this;
    }
    /**
     * Выбор варианта оплаты "Задолженность"
     */
    public MtsMainPage2 selectDebt(){
        driver.findElement(accordionBtn).click();
        driver.findElement(debtBtn).click();
        System.out.println("Выбран вариант оплаты 'Задолженность'");
        return this;
    }
    /**
     * Получение плейсхолдера "Задолженность" > Номер счета
     */
    public MtsMainPage2 getDebtAccNumber(){
        String actDebtAccNumber = driver.findElement(debtAccNumber).getAttribute("placeholder");
        Assertions.assertEquals("Номер счета на 2073", actDebtAccNumber);
        return this;
    }
    /**
     * Получение плейсхолдера "Задолженность" > Сумма
     */
    public MtsMainPage2 getDebtSumm(){
        String actDebtSumm = driver.findElement(debtSumm).getAttribute("placeholder");
        Assertions.assertEquals(ExpSumm, actDebtSumm);
        return this;
    }
    /**
     * Получение плейсхолдера "Задолженность" > Email
     */
    public MtsMainPage2 getDebtEmail (){
        String actDebtEmail = driver.findElement(debtEmail).getAttribute("placeholder");
        Assertions.assertEquals(ExpEmail, actDebtEmail);
        return this;
    }
}
