package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
		@FindBy(xpath="//*[@id=\"header_container\"]/div[1]/div[2]/div")
		WebElement logo;
		
		@FindBy(xpath=("//*[@id=\"react-burger-menu-btn\"]"))
		WebElement menu;
		
		@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
		WebElement logout;
		
		@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
		WebElement cart1;
		
		@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
		WebElement cart2;
		
		@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
		WebElement cart3;
		
		@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
		WebElement basket;
		
		@FindBy(xpath="//*[@id=\"checkout\"]")
		WebElement checkOut;
		
		@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
		WebElement verify;
		
		public String setLogo()
		{
		
		try
		{
			return (logo.getText());
		}
		catch(Exception e)
		{
			return("No logo found");
		}
	}
		public void setLogout()
		{
			menu.click();
			logout.click();
		}
		
		public void setCart() throws InterruptedException
		{
		cart1.click();
		cart2.click();
		cart3.click();
		Thread.sleep(1000);
		basket.click();
		Thread.sleep(1000);
		checkOut.click();
		
		}
		
		public String confHome()
		{
		try
		{
			return (verify.getText());
			
		}
		catch(Exception e)
		{
			return("Failed to return Home page");
		}
		
}
}
