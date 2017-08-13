package loginverification;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginValidation {
	@Test
	public void loginusingcorrectdetails()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to(" http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr92862");
		driver.findElement(By.name("password")).sendKeys("ebajyve");
		driver.findElement(By.name("btnLogin")).click();
		driver.quit();
		
	}
	@Test
	public void tovalidatewithcorrectdetails()
	{
		String managerid="Manger Id";
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to(" http://www.demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr92862");
		driver.findElement(By.name("password")).sendKeys("ebajyve");
		driver.findElement(By.name("btnLogin")).click();
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
		String obtainedvalue=message.getText();
	if(obtainedvalue.contains(managerid)){
		System.out.println("Login successful");
	}
	else{
		System.out.println("Login failed");
	}
		driver.quit();
		
	}
	@Test
	public void tovalidatewithincorrectdetails() throws InterruptedException
	{
		String message="not valid";
		System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
	driver.findElement(By.name("uid")).sendKeys("mngr92862");
	driver.findElement(By.name("password")).sendKeys("abcd");
	driver.findElement(By.name("btnLogin")).click();
	
	Thread.sleep(2000);
    Alert alert= driver.switchTo().alert();
    String alertbox=alert.getText();
    if (alertbox.contains(message))
    {
    	System.out.println("Login unsuccessful");
    }
      
     alert.accept();
      
    Thread.sleep(2000);
    driver.quit();
	
}
}
