package loginverification;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class InternalOperations {
@Test
public void customerdetails() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.navigate().to(" http://www.demo.guru99.com/V4/");
	driver.manage().window().maximize();
	driver.findElement(By.name("uid")).sendKeys("mngr92862");
	driver.findElement(By.name("password")).sendKeys("ebajyve");
	driver.findElement(By.name("btnLogin")).click();
	driver.findElement(By.linkText("New Customer")).click();
	driver.findElement(By.name("name")).sendKeys("Donno");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
	driver.findElement(By.name("dob")).sendKeys("15 06 2013");
	driver.findElement(By.name("addr")).sendKeys("Kasim nagar\nEast gate\nThanjavur");
	driver.findElement(By.name("city")).sendKeys("Thanjavur");
	driver.findElement(By.name("state")).sendKeys("TamilNadu");
	driver.findElement(By.name("pinno")).sendKeys("613001");
	driver.findElement(By.name("telephoneno")).sendKeys("0436224561");
	driver.findElement(By.name("emailid")).sendKeys("donno@gmail.com");
	driver.findElement(By.name("password")).sendKeys("guru");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
Thread.sleep(2000);
alert.accept();
driver.findElement(By.partialLinkText("Continue")).click();
//driver.close();




}
}
