package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public FirefoxOptions options;

    public BrowserDriver() {

        options = new FirefoxOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        /* this.driver = driver; */
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        this.driver = new FirefoxDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    };
    public void close(){
        this.driver.close();
    }
}
