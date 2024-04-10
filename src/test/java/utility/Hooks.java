package utility;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Hooks {
    public static BrowserDriver driver;
    public static FirefoxOptions options;
    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}