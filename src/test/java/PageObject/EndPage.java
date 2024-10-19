package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EndPage extends BasePage {
	
	public EndPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement bkhome;
	
	public void setToHome()
	{
		bkhome.click();
	}
}
