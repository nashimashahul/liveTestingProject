package loginverification;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
@Test(dataProvider="getdata")
public void logindetails(String username,String password)
{
System.out.println(username+" is a new user");	
System.out.println(password+" created new password");
}
@DataProvider(name="getdata")
public Object[][] getdata()
{
	Object[][] data = new Object[3][2];//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	data[0][0] ="alpha";
	data[0][1] = "abcdef";

	// 2nd row
	data[1][0] ="beta";
	data[1][1] = "zxcvb";
	
	// 3rd row
	data[2][0] ="ciero";
	data[2][1] = "pass123";

	return data;
}


}
