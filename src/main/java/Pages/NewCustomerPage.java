package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.Constents;
import Utilities.ElementUtilities;

public class NewCustomerPage extends BasePage {
	
	WebDriver driver;
	ElementUtilities utils;
	
	public NewCustomerPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	
	
	By CustomerName=By.name("name");
	By GenderMale=By.xpath("//input[@value='m']");
	By GenderFemale=By.xpath("//input[@value='f']");
	By DOB=By.id("dob");
	By Address=By.name("addr");
	By City=By.name("city");
	By State=By.name("state");
	By Mobile=By.name("telephoneno");
	By Email=By.name("emailid");
	By Password=By.name("password");
	By PIN=By.name("pinno");
	By Submit=By.xpath("//input[@value='Submit']");
	By Reset=By.xpath("//input[@value='Reset']");
	

	
	public String getNewCustomerPageTitle() {
		utils.doNavigatePage(Constents.newCustomerPageURL);
		return utils.doGetTitle();
	}
	
	public void donewCustomerRegistration(String name,String gender, String dob, String address,
			String city, String state, String pin, String telephone, String email, String password) {
		utils.doNavigatePage(Constents.newCustomerPageURL);
		utils.doSendKeys(CustomerName, name);
		if(gender.equalsIgnoreCase("male")) {
			utils.doClick(GenderMale);
		} else {
			utils.doClick(GenderFemale);
		}
		utils.doSendKeys(DOB, dob);
		utils.getWebElement(DOB).sendKeys(Keys.TAB);
		utils.doSendKeys(Address, address);
		utils.doSendKeys(City, city);
		utils.doSendKeys(State, state);
		utils.doSendKeys(PIN, pin);
		utils.doSendKeys(Mobile, telephone);
		utils.doSendKeys(Email, email);
		utils.doSendKeys(Password, password);
		
		utils.doClick(Submit);
	}

}
