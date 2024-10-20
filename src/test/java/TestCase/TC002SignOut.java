package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.HomePage;
import PageObject.SignInPage;
import TestBase.BaseClass;

public class TC002SignOut extends BaseClass {
	
@Test(groups= "Regression")
public void logOut() throws InterruptedException
	{
	logger.info("*********Start Sign out process************");
	SignInPage hp = new SignInPage(driver);
	hp.setUsername(p.getProperty("username"));
	hp.setPassword(p.getProperty("password"));
	hp.setSignin();
	
	Thread.sleep(3000);
	
	HomePage mp = new HomePage(driver);

	String title1=mp.setLogo();
	System.out.println(title1);
	if(title1.equals("Swag Labs"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
		logger.debug("Debug logs.....");
		logger.error("Test failed************");
	}

	mp.setLogout();
	
	logger.info("TC002 Signout Test completed sucessfully*********");
	}
	
}

