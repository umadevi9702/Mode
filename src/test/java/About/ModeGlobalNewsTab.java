package About;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ModeGlobalNewsTab {
	WebDriver driver;
	
  @Test(priority=1)
  public void Validate() {
	  
	  
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
	  opt.addExtensions(file);
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.modeglobal.com/");
	  System.out.println("Message:"+driver.getTitle());
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-7902 qodef-menu-item--narrow']//a[@href='#']//span[@class='qodef-menu-item-text'][normalize-space()='About']")).click();
	  System.out.println("Message:About tab cliked");
	  driver.findElement(By.xpath("//ul[@id='menu-main-menu-1']//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-8433']//a")).click();
	  System.out.println("Message:Mode Global News "+driver.getTitle());
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  System.out.println("Window scrolled down");
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
