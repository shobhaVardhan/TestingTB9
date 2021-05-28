package log4jPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageWithPage {
	
	WebDriver driver;
	
	@FindBy(name="userName1")
	WebElement username;	
	
	//dynamic
	@FindBy(how=How.NAME,using="password")
	WebElement pass;
	
	@FindBy(how=How.NAME,using="submit")
	@CacheLookup
	WebElement login;
	
	
	public LoginPageWithPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginCheck(String un,String ps)
	{
		username.sendKeys(un);
		pass.sendKeys(ps);
		login.click();
	}
	
	
	

}
