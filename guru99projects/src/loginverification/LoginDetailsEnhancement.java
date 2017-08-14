package loginverification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDetailsEnhancement {
@Test
public void gettitle()
{
	String homepage="Guru99";
	System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.navigate().to(" http://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	driver.findElement(By.name("uid")).sendKeys("mngr92862");
	driver.findElement(By.name("password")).sendKeys("ebajyve");
	driver.findElement(By.name("btnLogin")).click();
	String title=driver.getTitle();
	if (title.contains(homepage)){
		System.out.println(title);
		System.out.println("Status:Passed");
	}
	else
	{
		System.out.println("Homepage is not opened");
	}
	//System.out.println(title);
	driver.quit();
}
	
	
	
	
	
}
