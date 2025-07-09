package Home;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import About.TestUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTab {
      
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
		 utils=new  TestUtilities(driver, opt);		 
	  }

  @Test(priority=1)
  public void Testcase1() {
	  driver.get("https://www.modeglobal.com/");
	  System.out.println(driver.getTitle());
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
  }
  
  @Test(priority=2)
  public void Testcase2()
  {
	  Testcase1();
	  driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-7857 current_page_item menu-item-7895']//a")).click();
	  System.out.println(driver.getTitle());
	   
	  
  }
  
  @Test(priority=3)
  public void Testcase3()
  {
	  Testcase2();
	  String text=driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-7857 current_page_item menu-item-7895']//a")).getText();
      if(text.equals("Home"))
      {
    	  System.out.println(text);
      }
      else
      {
    	  System.out.println("Test Fail");
      }
   
  }
   
 
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
