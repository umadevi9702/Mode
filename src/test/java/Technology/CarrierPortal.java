package Technology;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarrierPortal {
	
	WebDriver driver;
  @Test
  public void A() throws InterruptedException, MalformedURLException {
	  
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  opt.addArguments("--headless=new");
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  WebDriverManager.chromedriver().setup();	 
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.modeglobal.com/");
	  System.out.println("Modegloable URL Opened");
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  driver.findElement(By.xpath("//body/div[@id='qodef-page-wrapper']/header[@id='qodef-page-header']/div[@id='qodef-page-header-inner']/nav[@aria-label='Top Menu']/ul[@id='menu-main-menu-1']/li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7998 qodef-menu-item--narrow']/a[1]")).click();
	  System.out.println("Technology tab clicked");
	  Thread.sleep(3000);	 
	 driver.findElement(By.className("qodef-menu-item-text")).click();	  
	 System.out.println("Carrier Portal tab clicked");	  
	  
	 
  }
}
