package About;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	WebDriver driver;
	TestUtilities utils;
	
		

  @BeforeMethod
  public void setup() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  utils=new TestUtilities(driver, opt);
	  
  }
  
  
  @Test(priority=1)
  public void A() {
	  
	  utils.launchapplication("https://www.modeglobal.com/"); 
	  System.out.println("Url opened");
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  
	  
	  
  }
   


  @AfterMethod
  public void teardown() {
	  driver.quit();
	  System.out.println("Window closed");
  }

 

}
