package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class ManagerHomePage extends BasePage {
	
	WebDriver driver;
	ElementUtilities utils;
	
	public ManagerHomePage(WebDriver driver) {
		this.driver=driver;
		utils=new ElementUtilities(driver);
	}
	
	By ManagerId=By.xpath("//td[normalize-space()='Manger Id : mngr402398']");
	
	By Header= By.xpath("//h2[@class='barone']");
	
	By NewCustomer= By.xpath("//a[normalize-space()='New Customer']");
	
	By EditCustomer=By.xpath("//a[normalize-space()='Edit Customer']");
	
	By DeleteCustomer= By.xpath("//a[normalize-space()='Delete Customer']");
	
	By NewAccount=By.xpath("//a[normalize-space()='Delete Customer']");
	
	By EditAccount =By.xpath("//a[normalize-space()='Edit Account']");
	
	By DeleteAccount=By.xpath("//a[normalize-space()='Delete Account']");
	
	public String getManagerHomePageTitle() {
		return utils.doGetTitle();
	}
	
	public String getManagerId() {
		return utils.doGetText(ManagerId);
	}
	
	public boolean headerIsDisplay() {
		return utils.DoIsDDisplay(Header);
	}
	
	public boolean newCustomerIsDisplay() {
		return utils.DoIsDDisplay(NewCustomer);
		
	}
	
	public boolean editCustomer() {
		return utils.DoIsDDisplay(EditCustomer);
	}
	
	
	
	

}
