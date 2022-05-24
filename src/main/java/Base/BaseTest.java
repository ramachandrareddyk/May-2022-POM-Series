package Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.EditCustomerPage;
import Pages.HomePage;
import Pages.ManagerHomePage;
import Pages.NewCustomerPage;

public class BaseTest {
	
	
	public WebDriver driver;
	public BasePage base;
	public Properties prop;
	public HomePage home;
	public ManagerHomePage ManagerHome;
	public NewCustomerPage newcustomer;
	public EditCustomerPage editCustomer;
	
	
	@BeforeMethod
	public void setUp() {
		base= new BasePage();
		prop=base.init_properties();
		driver=base.init_Browser(prop.getProperty("browser"));
		home= new HomePage(driver);
		ManagerHome= new ManagerHomePage(driver);
		newcustomer= new NewCustomerPage(driver);
		editCustomer= new EditCustomerPage(driver);
		driver.get(prop.getProperty("url"));
		

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
