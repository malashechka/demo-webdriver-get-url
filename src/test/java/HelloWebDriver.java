import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HelloWebDriver {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new SafariDriver();
        driver.get("https://fsc.bsu.by/ru/raspisanie-zanyatij/");
        Thread.sleep(8000);
        driver.quit();
    }
}
