package log4jPOM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//Update the file for test Purpose
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest 
{
	 public WebDriver driver;
	  
	  @Test
	  public void registerData1() {
			
		  LoginPageWithPage lp=new LoginPageWithPage(driver);
		  lp.loginCheck("QQQQQ","qqqqq");		  
	  }
	  	 	
	  @BeforeTest
	  public void getUrl() {
		  driver.get("http://demo.guru99.com/test/newtours/login.php");
	  }

	  @BeforeSuite
	  public void getBrowser() {
		  System.err.println("this is before suite annotation ");
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		  driver = new ChromeDriver();	  
	  }
	

}
