package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class ManagerHomeTest extends BaseTest{
	
	@Test
	public void validatePageHeaderTest() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(ManagerHome.headerIsDisplay());
	}
	
	@Test
	public void validateManagerId() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		String id=ManagerHome.getManagerId();
		
		Assert.assertTrue(id.contains(Constents.ManagerId));
		
	}
	
	@Test
	public void validteNewCustomerIsDisplayTest() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(ManagerHome.newCustomerIsDisplay());
	}

}
