package About;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadershipTab {
	
	WebDriver driver;
	TestUtilities utils;	
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  utils=new TestUtilities(driver, opt);	  
  }

  @Test(priority=1)
  public void launchapplication() {
	  
	  driver.get("https://www.modeglobal.com/");
	  System.out.println("Message: "+driver.getTitle());
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  
  }
  
  
  @Test(priority=2)
  public void AboutTab() throws InterruptedException
  {
	  launchapplication();
	  System.out.println("Message:"+driver.getTitle());
	  driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[contains(@class,'menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-7902 qodef-menu-item--narrow')]//a[contains(@href,'#')]//span[contains(@class,'qodef-menu-item-text')][normalize-space()='About']")).click();
	  System.out.println("About tab clicked");
	  Thread.sleep(3000);
	  
  }
  @Test(priority=3)
  public void leadership() throws InterruptedException
  {
	  AboutTab();
	  System.out.println("About tab clicked");
	  driver.findElement(By.xpath("(//span[contains(@class,'qodef-menu-item-text')][normalize-space()='Leadership'])[1]")).click();
	  System.out.println("Message:"+driver.getTitle());	  
	                                  
  }
  
  @Test(priority=4)
  public void Meettheteam() throws InterruptedException
  {
	  leadership();
	  System.out.println("3rd testcase ran");
	  String text=driver.findElement(By.xpath("//h2[normalize-space()='Meet the team']")).getText();
	  if(text.equals(text))
	  {System.out.println("Test pass:"+text);}
	  else 
	  {
		  System.out.println("Test fail");
	  }
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
	  
  }
  
  
  
  
  
  
  
  
  
  

}
