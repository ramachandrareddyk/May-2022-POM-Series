package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilities {

	WebDriver driver;
	
	public ElementUtilities(WebDriver driver) {
		this.driver=driver;
	}
	//Get the Webelement
	public WebElement getWebElement(By Locater) {
		WebElement element= driver.findElement(Locater);
		
		return element;
	}
	
	//Click
	public void doClick(By Locater) {
		getWebElement(Locater).click();
	}
	
	//SendKeys
	public void doSendKeys(By Locater, String Value) {
		getWebElement(Locater).sendKeys(Value);
	}
	
	//Get Title
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	//IsDisplay
	public boolean DoIsDDisplay(By Locater) {
		return getWebElement(Locater).isDisplayed();
	}
	
	//getText
	public String doGetText(By Locater) {
		return getWebElement(Locater).getText();
	}
	
	//navigate to page
	public void doNavigatePage(String URL) {
		driver.navigate().to(URL);
	}
}
