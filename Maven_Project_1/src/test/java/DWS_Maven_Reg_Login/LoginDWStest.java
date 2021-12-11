package DWS_Maven_Reg_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Maven_Project_1.Base_Test_BrowserSetup_Close;
import Test.Maven_Project_1.Utility_Function_calling;

public class LoginDWStest extends Base_Test_BrowserSetup_Close
{
	@DataProvider(name = "TestData1")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][2];
		
		data[0][0]="summu1234567890@gmail.com";
		data[0][1]="123456";
		
		return data;
	}
	@Test(dataProvider="TestData1")
	public void Tc02(String email,String pwd)
	{
	WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
	Utility_Function_calling.click_WebElement(login);

	WebElement Email1=driver.findElement(By.xpath("//input[@name='Email']"));
	Utility_Function_calling.Enter_value_in_editfield_as_Method_sendkey1(Email1,email);
	
	WebElement password1=driver.findElement(By.xpath("//input[@name='Password']"));
	Utility_Function_calling.Enter_value_in_editfield_as_Method_sendkey1(password1,pwd);
	
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
	Utility_Function_calling.click_WebElement(checkbox);
	
	WebElement login1=driver.findElement(By.xpath("//input[@value='Log in']"));
	Utility_Function_calling.click_WebElement(login1);
	}

}
