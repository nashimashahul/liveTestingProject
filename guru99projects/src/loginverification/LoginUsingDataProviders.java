package loginverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingDataProviders {
	@Test(dataProvider="getdata")
	public void loginusingcorrectdetails(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to(" http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.quit();
		}
	@DataProvider(name="getdata")
	public Object[][] getdata()
	{
		Object[][] data = new Object[4][2];
		data[0][0] ="mngr92862";
		data[0][1] = "ebajyve";

		// 2nd row
		data[1][0] ="invalid";
		data[1][1] = "ebajyve";
		
		// 3rd row
		data[2][0] ="mngr92862";
		data[2][1] = "invalid";

		data[3][0] ="invalid";
		data[3][1] = "invalid";
		
		return data;
	}
	
	//instead of testing.xml file..we are passing values from same file and
	//we can assign more value to a single parameter
	
	
	
	
	
}
