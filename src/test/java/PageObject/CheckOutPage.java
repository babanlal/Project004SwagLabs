package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {

	public CheckOutPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement pcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement cont;
	
	public void setName1(String name1)
	{
		fname.sendKeys(name1);
	}
	public void setName2(String name2)
	{
		lname.sendKeys(name2);
	}
	public void setPostCode(String code1)
	{
		pcode.sendKeys(code1);
	}
	public void setCont()
	{
		cont.click();
	}
}
