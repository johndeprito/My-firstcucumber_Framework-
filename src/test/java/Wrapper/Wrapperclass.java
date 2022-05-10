package Wrapper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapperclass implements WwrapperInterface {
	public static RemoteWebDriver driver;

	public void openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// TODO Auto-generated method stub

	}

	public WebElement locateElement(String locator, String locatorVal) {

		switch (locator) {
		case "id":
			return driver.findElement(By.id(locatorVal));
		case "class":
			return driver.findElement(By.className(locatorVal));
		case "linkText":
			return driver.findElement(By.linkText(locatorVal));
		case "partialLinkText":
			return driver.findElement(By.partialLinkText(locatorVal));
		case "xpath":
			return driver.findElement(By.xpath(locatorVal));
		case "css":
			return driver.findElement(By.cssSelector(locatorVal));
		case "name":
			return driver.findElement(By.name(locatorVal));
		}

		// TODO Auto-generated method stub
		return null;
	}

	public void elementTypeByID(WebElement element, String value) {
     
		element.sendKeys(value);
		// TODO Auto-generated method stub

	}

	public void elementClickByID(WebElement element, String value) {

		element.click();
		// TODO Auto-generated method stub

	}

	public void elementTypeByXpath(WebElement element, String value) {

		element.sendKeys(value);
		// TODO Auto-generated method stub

	}

	public void elementClickByXpath(WebElement element, String value) {

		element.click();
		// TODO Auto-generated method stub

	}
	
	/*public void elementSelectByValue(WebElement element, String value) {

	Select drp = new Select(element);
	drp.selectByValue(value);
	*/
}

