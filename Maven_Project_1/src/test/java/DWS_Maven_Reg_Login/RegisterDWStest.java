package DWS_Maven_Reg_Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Maven_Project_1.Base_Test_BrowserSetup_Close;
import Test.Maven_Project_1.Utility_Function_calling;

public class RegisterDWStest extends Base_Test_BrowserSetup_Close
{
	@DataProvider(name = "TestData1")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][5];
		
		data[0][0]="Suman";
		data[0][1]="Mahendrakar";
		data[0][2]="summu1234567890@gmail.com";
		data[0][3]="123456";
		data[0][4]="123456";
	
		return data;
	}
	@Test(dataProvider="TestData1")
	public void Tc01_Reg(String firstnames,String lastnames,String Username,String password,String confirm ) throws IOException{
		         
		
		WebElement register_link=driver.findElement(By.xpath("//a[text()='Register']"));
		register_link.click();
		WebElement radiobutton=	driver.findElement(By.xpath("//input[@id='gender-female']"));
		radiobutton.click();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='FirstName']"));
	      firstName.sendKeys(firstnames);
		WebElement lastName=driver.findElement(By.xpath("//input[@name='LastName']"));
		lastName.sendKeys(lastnames);
 		WebElement Email=driver.findElement(By.xpath("//input[@name='Email']"));
		  Email.sendKeys(Username);
		WebElement Password=driver.findElement(By.xpath("//input[@name='Password']"));
		   Password.sendKeys(password);
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
	      confirm_pass.sendKeys(confirm);
		WebElement register_Button=driver.findElement(By.xpath("//input[@name='register-button']"));
		Utility_Function_calling.click_WebElement(register_Button);
		
	    }
}





