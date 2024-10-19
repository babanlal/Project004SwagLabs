package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayPage extends BasePage {
	public PayPage (WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;
	@FindBy(xpath="//*[@id=\"cancel\"]")
	WebElement cancel;
	
	public void setFinish()
	{
		finish.click();
	}
	
	public void setCancel()
	{
		cancel.click();
	}
}
