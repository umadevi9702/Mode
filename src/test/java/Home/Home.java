package Home;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {	
	WebDriver driver;

 
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions opt=new ChromeOptions();
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	  
  }

  @Test
  public void A() {
	  driver.get("https://www.kansasworks.com/");
	  System.out.println("URL Opened: "+driver.getTitle());
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
  }
   
  
  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
