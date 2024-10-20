package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.SignInPage;
import TestBase.BaseClass;

public class TC001SignIn extends BaseClass {

@Test(groups="Sanity")
public void SignIn()
{
	logger.info("*********Start SignIn process************");
SignInPage hp = new SignInPage(driver);
hp.setUsername(p.getProperty("username"));   //("standard_user");
hp.setPassword(p.getProperty("password"));   //("secret_sauce");
hp.setSignin();



HomePage mp = new HomePage(driver);
logger.info("******verify Home page********");
String title4 = mp.confHome();
System.out.println(title4);
if(title4.equals("Products"))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
	logger.debug("Debug logs.....");
	logger.error("Test failed************");
}

logger.info("TC001 SignIN test completed");
}
}
