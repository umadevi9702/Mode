package About;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AboutwithDocker {	
  
@Test
  public void A() throws MalformedURLException {
	
	ChromeOptions opt=new ChromeOptions();
	//FirefoxOptions opt=new FirefoxOptions();

@SuppressWarnings("deprecation")
URL url=new URL("http://localhost:4444/wd/hub");

WebDriver driver=new RemoteWebDriver(url, opt);

driver.get("https://www.modeglobal.com/");
System.out.println("Modeglobal URL Opened");
driver.manage().window().maximize();
System.out.println("Window maximized");
driver.quit();
System.out.println("Window closed");


	
	  
  }
  
  
  
  
}
