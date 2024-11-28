package Services;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import About.TestUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Intermodal {
    
	WebDriver driver;
	TestUtilities utils;
	
	
	@BeforeMethod
	public void A()
	{
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
  public void Testcase_Intermodal() throws InterruptedException 
  {
	  utils.launchapplication("https://www.modeglobal.com/");
	  System.out.println("Message: "+driver.getTitle());
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  driver.findElement(By.xpath("//body/div[@id='qodef-page-wrapper']/header[@id='qodef-page-header']/div[@id='qodef-page-header-inner']/nav[@aria-label='Top Menu']/ul[@id='menu-main-menu-1']/li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7896 qodef-menu-item--narrow']/a[1]")).click();
      System.out.println("Service tab clicked");
      Thread.sleep(3000);
                                          
     
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement intermodalTab = wait.until(ExpectedConditions.elementToBeClickable(By.className("qodef-menu-item-text")));
    intermodalTab.click();
    // driver.findElement(By.className("qodef-menu-item-text")).click();
	 System.out.println("Intermodal tab cliked");
	 
	 
   String text=driver.findElement(By.xpath("//h2[contains(text(),'Your destination for')]")).getText(); 
   Thread.sleep(3000);
  
	 	 
    if (text.equals(text)) {
        System.out.println("Test Pass:Your destination for"+text);
    } else {
        System.out.println("Test Fail");
    }
	 
  }
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 @AfterMethod
  public void D() 
  {
	  driver.quit();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}
