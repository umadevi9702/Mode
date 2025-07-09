package Technology;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CarrierPortalWithDocker {	
	
	
  @Test
  public void A() throws MalformedURLException, InterruptedException {
	  
	  ChromeOptions opt=new ChromeOptions();
	  @SuppressWarnings("deprecation")
	  URL url=new URL("http://localhost:4444/wd/hub");
	  WebDriver driver=new RemoteWebDriver(url, opt);
	  
	  driver.get("https://www.modeglobal.com/");
	  System.out.println("Modeglobal URL Opened");
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  driver.findElement(By.xpath("//body/div[@id='qodef-page-wrapper']/header[@id='qodef-page-header']/div[@id='qodef-page-header-inner']/nav[@aria-label='Top Menu']/ul[@id='menu-main-menu-1']/li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7998 qodef-menu-item--narrow']/a[1]")).click();
	  System.out.println("Technology tab clicked");
	  Thread.sleep(3000);	 
	  driver.findElement(By.className("qodef-menu-item-text")).click();	  
	  System.out.println("Carrier Portal tab clicked");	
	  driver.quit();
	  System.out.println("Widnow closed");
	  
	  
  }
  
  
}
