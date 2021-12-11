package Test.Maven_Project_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Function_calling 
{
	//configuration method
	public static String Test_Configuration(String key) throws IOException
	{
	String filePath = "./Test_Configuration/Config.properties";
	FileInputStream fis = new FileInputStream(filePath);
	Properties prop = new Properties();
	prop.load(fis);
	String value = prop.getProperty(key);
	return value;
    }
	
	

	//Utility function to enter value in edit field
		public static void Enter_value_in_editfield_as_Method_sendkey1(WebElement element, String value)
		{
			element.sendKeys(value);
		}
		
		public static void click_WebElement(WebElement element)
		{
			element.click();
		}
		
		public static void Visible_Text(WebElement element, String text )
		{
			Select sel = new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public static void Index_By(WebElement element, int index )
		{
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
		
		public static void Value_By(WebElement element, String value )
		{
			Select sel = new Select(element);
			sel.selectByValue(value);
		}	
	}
		
