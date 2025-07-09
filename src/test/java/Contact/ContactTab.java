package Contact;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import About.TestUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactTab {
	
	WebDriver driver;
	TestUtilities utils;
	

  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  utils=new TestUtilities(driver, opt);
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	  
  }

  
  @Test(priority=1)
  public void A() {
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.modeglobal.com/");
	  driver.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void B() 
  {
	  A();
	  
	  driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-8275']//a")).click();
	  System.out.println("Contact tab got cliked");  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  System.out.println("window scrolled down");
  }
  
  @Test(priority=3)
  public void C()
  {
	  B();
	  
	  String text=driver.findElement(By.xpath("//span[contains(@class,'qodef-m-title-text')][normalize-space()='Truckload']")).getText();
	  if(text.equals("Truckload"))
	  {System.out.println(text);}
	  else 
	  {
		  System.out.println("Test Fail");
	  }
    
  }
  
  
  
  
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }

}
