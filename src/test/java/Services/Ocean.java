package Services;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ocean {
	
	WebDriver driver;

  @BeforeTest
  public void beforeTest() {
	  ChromeOptions opt=new ChromeOptions();
	  opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	 // opt.addArguments("--headless=new");
	  File file=new File("C:\\Automation\\Myworkspaces\\Files\\CRX Files\\SelectorsHub-XPath.crx");
      opt.addExtensions(file);
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver(opt);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
  
  }
  
  @Test
  public void A() throws InterruptedException {
	  
	  driver.get("https://www.modeglobal.com/");
	  System.out.println("URL Opened");
	  driver.manage().window().maximize();
	  System.out.println("Window maximized");
	  
	  driver.findElement(By.xpath("//button[@data-cky-tag='accept-button']")).click();
	  System.out.println("Accept button clicked");
	  
	  
	  driver.findElement(By.xpath("(//span[@class='qodef-menu-item-text'][normalize-space()='Services'])[1]")).click();
	  System.out.println("Services tab clicked");
	 
	  
  /* WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement oceanTab = wait.until(ExpectedConditions.elementToBeClickable(By.className("qodef-menu-item-text")));
	    oceanTab.click();*/
	    driver.findElement(By.className("qodef-menu-item-text")).click();
	  //driver.findElement(By.xpath("(//*[name()='svg'][@class='qodef-svg--plus qodef-menu-item-plus'])[3]")).click();
		driver.findElement(By.name("Ocean")).click();
	    System.out.println("Ocean tab cliked");
		
		
	   
	 
	  
	 /* JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  System.out.println("Window scrolled down");	  
	  js.executeScript("window.scrollTo(0, 0)");
	  System.out.println("Window scrolled up");*/
	  
	  
  }

  

 @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Window closed");
  }

}
