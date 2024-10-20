package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	public Logger logger;

	
	@BeforeTest(groups= {"Sanity","Regression","Master"})
	public void setup() throws IOException
	{
		logger = LogManager.getLogger(this.getClass());
		
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
	
	@AfterTest(groups= {"Sanity","Regression","Master"})
	public void close()
	{
		driver.close();
	}
	
	public String captureScreen (String tname) throws IOException 
	{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver; 
		File sourceFile = takesScreenshot.getScreenshotAs (OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + " " + timeStamp +".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		return targetFilePath;

	}


}


