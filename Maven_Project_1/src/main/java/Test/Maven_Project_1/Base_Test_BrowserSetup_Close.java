package Test.Maven_Project_1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

  public class Base_Test_BrowserSetup_Close
{
	public WebDriver driver;
	@BeforeClass
	public void BrowserSetup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse pgrm\\Selenium_Training\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().refresh();
		String DWSURL = Utility_Function_calling.Test_Configuration("DWSURL");
		//String url2 = Utility_Function_calling.Test_Configuration("AutomationPractiseURL");
		driver.get(DWSURL);
		//driver.get(url2);
		//driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

	}
	
	@AfterClass
	public void close_04()
	{
	     driver.close();;
	}
}
