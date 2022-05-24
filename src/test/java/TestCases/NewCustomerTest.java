package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;
import Utilities.ExcelUtilities;

public class NewCustomerTest extends BaseTest{

	@DataProvider
	public Object[][] getTestData() {
		Object[][] Testdata= ExcelUtilities.getTestData("Sheet1");
		return Testdata;
	}
	
	
	@Test
	public void validateNewCustomerPageTitle() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String title= newcustomer.getNewCustomerPageTitle();
		Assert.assertEquals(title, Constents.NewCustomerPageTitle);
	}
	@Test(dataProvider = "getTestData")
	public void validateNewCustomerRegistrationTest(String Name, String Gender, String DOB, String Address,
			String City, String State, String Pin, String Mobile, String Email, String Password) {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		newcustomer.donewCustomerRegistration(Name,Gender, DOB, Address,City,State,Pin, Mobile, Email,Password);
	}
	
	
	
	
}
