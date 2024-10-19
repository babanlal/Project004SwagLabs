package TestBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
	public WebDriver driver;
	public Properties p;

	@BeforeTest()
	public void setup() throws IOException
	{
		
		FileReader file = new FileReader("./src//test//resources//properties");
		p = new Properties();
		p.load(file);
		
	System.getProperty("webdriver.chrome.driver", "E:\\selenium\\New chromedriver\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(p.getProperty("url"));    //("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}
	
	/*
	@AfterTest()
	public void close()
	{
		driver.close();
	}
	*/
}
