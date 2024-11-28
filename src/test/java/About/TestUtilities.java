package About;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestUtilities {
    WebDriver driver;
    ChromeOptions options;

   
    //Constructor
    public TestUtilities(WebDriver driver, ChromeOptions options) {
        this.driver = driver;
        this.options = options;
    }

    public void launchapplication(String url) {
        driver.get(url);
    }
}
