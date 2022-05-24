package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	public Properties prop;

	public WebDriver init_Browser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox+")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the correct browser");
		}
		driver.manage().window().maximize();

		return driver;
	}

	public Properties init_properties() {

		String path = "C:\\Users\\Gopi\\eclipse-workspace\\May_2022_POM_Searies\\src\\main\\java\\ConfigProperties\\Config.properties";
		prop = new Properties();

		try {
			FileInputStream fi = new FileInputStream(path);

			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	public String getScreenshot() {
		File filesrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\Gopi\\eclipse-workspace\\May_2022_POM_Searies\\Screenshots\\"
				+ System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(filesrc, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;

	}

}
