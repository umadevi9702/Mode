package Careers;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CareersTab {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void Validate() {
	  
	  ChromeOptions opt=new ChromeOptions();
		 opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		 File file=new File("C:\\Automation\\Myworkspaces\\\\Files\\CRX Files\\SelectorsHub-XPath.crx");
		 opt.addExtensions(file);
		 
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.modeglobal.com/services/");
		 System.out.println("Message:"+driver.getTitle());
		 driver.manage().window().maximize();
		 System.out.println("Window maximized");
		 driver.findElement(By.xpath("//body/div[@id='qodef-page-wrapper']/header[@id='qodef-page-header']/div[@id='qodef-page-header-inner']/nav[contains(@aria-label,'Top Menu')]/ul[@id='menu-main-menu-1']/li[contains(@class,'menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-7901 qodef-menu-item--narrow')]/a[1]")).click();
		 System.out.println("Message:Career tab clicked");
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 System.out.println("Window scrolled down");
		 
		 String text=driver.findElement(By.xpath("//h2[normalize-space()='Employee']")).getText();
		 if(text.equals(text))
		 {System.out.println("Test Pass"+text);}
		 else {System.out.println("Test Fail");}
		  
		  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
