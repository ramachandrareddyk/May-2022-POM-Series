package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class HomePage extends BasePage {
	
	WebDriver driver;
	ElementUtilities utils;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	
	By header= By.xpath("//h2[@class='barone']");
	By UserId=By.xpath("//input[@name='uid']");
	By Password=By.xpath("//input[@name='password']");
	By LoginBtn=By.xpath("//input[@name='btnLogin']");
	By ResetBtn=By.xpath("//input[@name='btnReset']");

	public String getLoginPageTitle() {
		return utils.doGetTitle();
	}
	
	public boolean loginPageHeaderIsDisplay() {
		return utils.DoIsDDisplay(header);
	}
	
	public boolean basicElementsIsDisplay() {
		utils.DoIsDDisplay(LoginBtn);
		utils.DoIsDDisplay(Password);
		utils.DoIsDDisplay(UserId);
		return utils.DoIsDDisplay(ResetBtn);
	}
	
	public ManagerHomePage doLogin(String username, String password) {
		utils.doSendKeys(UserId, username);
		utils.doSendKeys(Password, password);
		utils.doClick(LoginBtn);
		
		return new ManagerHomePage(driver);
	}
}
