package Services;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServicesTab {
	
	WebDriver driver;
	
  @Test
  public void Validate() {
	  ChromeOptions opt=new ChromeOptions();
		 opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		 File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
		 opt.addExtensions(file);
		 
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //Thread.sleep(3000);
		 driver.get("https://www.modeglobal.com/");
		 System.out.println("Message:"+driver.getTitle());
		 driver.manage().window().maximize();
		 System.out.println("Message:Window maximized");
		 driver.findElement(By.xpath("//body/div[@id='qodef-page-wrapper']/header[@id='qodef-page-header']/div[@id='qodef-page-header-inner']/nav[@aria-label='Top Menu']/ul[@id='menu-main-menu-1']/li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7896 qodef-menu-item--narrow']/a[1]")).click();
		 System.out.println("Message: "+driver.getTitle());
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 System.out.println("Message: Scrolled down");
		 
		 String text=driver.findElement(By.xpath("//h2[contains(text(),'Delivering in')]")).getText();
		 System.out.println("Message:Delivering in every mode");
		 if(text.equals(text))
		 {
			 System.out.println("Test Pass");
		 }
		 else {
			 
			 System.out.println("Test Fail");
		 }
			 
		 
		  
		 driver.quit();
		  
		  
	  
	  
	  
	  
  }
}
