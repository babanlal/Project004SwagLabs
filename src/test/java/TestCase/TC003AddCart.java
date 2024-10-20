package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.CheckOutPage;
import PageObject.EndPage;
import PageObject.HomePage;
import PageObject.PayPage;
import PageObject.SignInPage;
import TestBase.BaseClass;

public class TC003AddCart extends BaseClass{
	
	@Test(groups= "Master")
	public void VerifyCart() throws InterruptedException
	{
		logger.info("Add 2 cart process starts**************");
		
		SignInPage sp = new SignInPage(driver);
		sp.setUsername(p.getProperty("username"));
		sp.setPassword(p.getProperty("password"));
		sp.setSignin();
		
		Thread.sleep(1000);
		HomePage hp = new HomePage(driver);
		hp.setCart();
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.setName1(p.getProperty("ftname"));
		cop.setName2(p.getProperty("ltname"));
		cop.setPostCode(p.getProperty("ptcode"));
		cop.setCont();
		
		PayPage pp = new PayPage(driver);
		pp.setFinish();
		
		EndPage Ep = new EndPage(driver);
		Ep.setToHome();
		
		String title3 = hp.confHome();
		System.out.println(title3);
		if(title3.equals("Products"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			logger.debug("Debug log*********");
			logger.error("Test Failed********");
		}
		
		logger.info("TC003 AddCart Test completed*************");
	}
	
	

}
