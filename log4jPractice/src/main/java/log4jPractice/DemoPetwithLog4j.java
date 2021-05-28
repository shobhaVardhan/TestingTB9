package log4jPractice;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoPetwithLog4j {
  public WebDriver driver;
	
  //@Test(dataProvider = "getData")
  static Logger log=Logger.getLogger(Log4jMethod.class.getName());
  
  @Test(enabled=true)
  public void ClickData() {
	  BasicConfigurator.configure();
	  
	  //log.info("Inside"+driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).getText());
	  log.info("Enter the store");
	  //driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
	   
	  log.info("Enter into the fish link");
	  
	  driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
	  
	  log.info("Enter into the fish product info ");
		
	  driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	  
	  log.info("Enter into add to cart page ");
	  
	  driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
	  
	  log.info(" Update Quantity ");
	  
	  driver.findElement(By.xpath("//input[@name='EST-1']")).clear();
	    
	  driver.findElement(By.xpath("//input[@name='EST-1']")).sendKeys("2");
	  
	
	  driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
	
	  log.info("register now button");
	  driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click(); 
		
  }
  
  @Test
  public void registerData()
  {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shobha");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shobha");
	  driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("shobha");
	  driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("shobha");  //
	  driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("vardhan");
	  driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("shobhag07@gmail.com");
	  driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("9527451289");
	  driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("Pune");
	  driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("pune");
	  driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("pune");
	  driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("maharashtra");
	  driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("411047");
	  driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
	 
	  WebElement ele =driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
		 Select e=new Select(ele);
		 e.selectByIndex(1);
		 
		 //account.favouriteCategoryId
		 
	  WebElement ele1=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
	  Select e1=new Select(ele1);
	  e1.selectByIndex(1);
	  
	  driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
	  driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
	  driver.findElement(By.xpath("//input[@name='newAccount']")).click();
	  
	  //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shobha");  
	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shobha");
	  //driver.findElement(By.xpath("//input[@name='newOrder']")).click();
	  
	  
  }
  
  
  @Test(enabled=true)
  public void loginData()
  {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shobha");
	  driver.findElement(By.xpath("//input[@name='password']")).clear();
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shobha");
	  driver.findElement(By.xpath("//input[@name='signon']")).click();
  }
  
  
		
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {new Object[] {"QQQQQ","qqqqq"},new Object[] {"AAAAA","aaaaa"},};
		
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hello");
  }

  @AfterMethod
  public void afterMethod() throws IOException {
		/*
		 * System.out.println("aptur srn shot"); File
		 * src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFileToDirectory(src, new
		 * File("C:\\Users\\Admin\\Desktop\\Complete Java\\TB9"));
		 */
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  
  @BeforeTest
  public void getUrl() {
	  driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void getBrowser() {
	  System.err.println("this is before suite annotation ");
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver = new ChromeDriver();	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.err.println();
  }

}
