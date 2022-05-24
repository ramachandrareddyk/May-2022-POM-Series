package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class HomeTest extends BaseTest{
	
	@Test
	public void verifyLoginPageTitleTest() {
		String title=home.getLoginPageTitle();
		Assert.assertEquals(title, Constents.LoginpageTitle);
	}
	
	@Test
	public void verifyLoginPageHeaderTest() {
		Assert.assertTrue(home.loginPageHeaderIsDisplay());
	}
	
	@Test
	public void verifyBasicElementsTest() {
		Assert.assertTrue(home.basicElementsIsDisplay());
	}
	
	@Test
	public void verifyLoginWithValidCredentials() {
		home.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		String title=ManagerHome.getManagerHomePageTitle();
		
		Assert.assertEquals(title, Constents.ManagerHomepageTitle);
		
	}

}
