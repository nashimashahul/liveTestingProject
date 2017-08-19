package loginverification;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginVerificationUsingParameters 
{
static WebDriver driver;
String message="Manger Id"; 
String alertboxmessage="is not valid";
@BeforeSuite
public void launchbrowser()
{
System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();

}
@Test
@Parameters({"username","password"})
public void usingparameters(String username,String password) throws Exception
{
	driver.navigate().to("http://www.demo.guru99.com/V4/");
	//System.out.println(username);
	//System.out.println(password);
	driver.findElement(By.name("uid")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("btnLogin")).click();	

try{
	Alert alert= driver.switchTo().alert();
String alertbox=alert.getText();
Thread.sleep(2000);
TakesScreenshot();
try{
	System.out.println(alertbox);
	//TakesScreenshot();
} catch (UnhandledAlertException exp) {
	// TODO Auto-generated catch block
	try{
		TakesScreenshot();	
	}
	catch(Exception e1){
		e1.printStackTrace();
	}

}
alert.accept();


 if (alertbox.contains(alertboxmessage)){
	System.out.println("Alert box Opened "); 
 }
 else{
	 System.out.println("No Alertbox message");
 }
}
catch(Exception e){
	TakesScreenshot();
	WebElement title=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
	String obtainedmessage=title.getText();
	System.out.println(obtainedmessage);
	try {
		TakesScreenshot();
	} catch (IOException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
	
if (obtainedmessage.contains(message)){
	System.out.println("Test case Passed");
}
else
{
	System.out.println("Test case Failed");
}
}
}
public static void TakesScreenshot() throws IOException{
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
}
@AfterSuite
public void closebrowser()
{
	driver.quit();
	
}
}
