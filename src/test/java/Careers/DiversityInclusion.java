package Careers;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiversityInclusion {
	
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
		 driver.get("https://www.modeglobal.com/");
		 System.out.println("Message:"+driver.getTitle());
		 driver.manage().window().maximize();
		 System.out.println("Window maximized");
		 driver.findElement(By.className("qodef-menu-item-text")).click();
		 System.out.println("clicked");
	  
	  driver.quit();
	  
	  
	  
  }
}
