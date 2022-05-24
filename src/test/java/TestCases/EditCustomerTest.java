package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class EditCustomerTest extends BaseTest {
	
	
	@Test
	public void validatePageTitleTest() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String title=editCustomer.getEditCustomerPageTittle();
		
		Assert.assertEquals(title, Constents.EditCustomerPageTitle);
	}
	
	@Test
	public void veripyPageHeaderTest() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertTrue(editCustomer.pageaderIsDisplay());
	}
	
	@Test
	public void verifyBasicElementsTest() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertTrue(editCustomer.basicElementsAreDisplay());
	}

}
