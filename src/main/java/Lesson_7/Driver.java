package Lesson_7;

public class Driver {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chrome-win64/chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
