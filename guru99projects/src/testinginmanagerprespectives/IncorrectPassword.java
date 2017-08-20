package testinginmanagerprespectives;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IncorrectPassword {
	
	@Test
	public void incorrectoldpassword() throws InterruptedException
	{
		String actualmessage="incorrect";
		String actualtitle="password";
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to(" http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr92862");
		driver.findElement(By.name("password")).sendKeys("ebajyve");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.partialLinkText("Change Password")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("mabcde");
		driver.findElement(By.name("newpassword")).sendKeys("123456@");
		driver.findElement(By.name("confirmpassword")).sendKeys("123456@");
		driver.findElement(By.name("sub")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String message=alert.getText();
		Thread.sleep(2000);
		alert.accept();
		if(message.contains(actualmessage)){
			System.out.println(message);
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		
	}
	}


