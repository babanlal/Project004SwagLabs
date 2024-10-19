package TestCase;

import org.testng.annotations.Test;
import PageObject.HomePage;
import PageObject.SignInPage;
import TestBase.BaseClass;

public class TC002SignOut extends BaseClass {
	
@Test(priority=1)
public void logOut() throws InterruptedException
	{
	SignInPage hp = new SignInPage(driver);
	hp.setUsername(p.getProperty("username"));
	hp.setPassword(p.getProperty("password"));
	hp.setSignin();
	
	Thread.sleep(3000);
	
	HomePage mp = new HomePage(driver);
	
	String title1=mp.setLogo();
	System.out.println(title1);
	
	mp.setLogout();
	
	}
	
}

