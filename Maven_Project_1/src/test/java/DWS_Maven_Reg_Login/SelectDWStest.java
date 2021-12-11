package DWS_Maven_Reg_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Test.Maven_Project_1.Base_Test_BrowserSetup_Close;
import Test.Maven_Project_1.Utility_Function_calling;

public class SelectDWStest  extends Base_Test_BrowserSetup_Close

{
	@DataProvider(name="TestData")
	public Object[][] testdata1(){
		Object[][] data=new Object[1][1];
		//1st iteration
		data[0][0]=2;
		
		return data;
	}
@Test(dataProvider="TestData")
public void Tc03(int index)
{
	WebElement books=driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]"));
	Utility_Function_calling.click_WebElement(books);
	
	WebElement position=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Utility_Function_calling.Index_By(position,index);
}
}


