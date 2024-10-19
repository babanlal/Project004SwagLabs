package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement user;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement signIn;
	
	public void setUsername(String fname)
	{
		user.sendKeys(fname);
	}
	public void setPassword(String fpass)
	{
		pass.sendKeys(fpass);
	}
	public void setSignin()
	{
		signIn.click();
	}
	
}
