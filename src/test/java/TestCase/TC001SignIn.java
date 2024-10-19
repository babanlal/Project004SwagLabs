package TestCase;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.SignInPage;
import TestBase.BaseClass;

public class TC001SignIn extends BaseClass {

@Test(priority=1)
public void SignIn()
{
SignInPage hp = new SignInPage(driver);
hp.setUsername(p.getProperty("username"));   //("standard_user");
hp.setPassword(p.getProperty("password"));   //("secret_sauce");
hp.setSignin();

HomePage mp = new HomePage(driver);
String title4 = mp.confHome();
System.out.println(title4);
}
}
