package stepDefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Wrapper.Wrapperclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login extends Wrapperclass {

	// It will launch the browser
	@Given("Open the browser and launch the application")
	public void openBrowser() {
		// after open browser below URL will be launch
		openBrowser("https://demo.openmrs.org/openmrs/login.htm");

	}

	@Then("Enter Username")
	public void enterUsername() {
		WebElement uName = locateElement("id", "username");
		uName.sendKeys("Admin");

	}

	@And("Enter Password")
	public void enterPassword() {
		WebElement pswd = locateElement("id", "password");
		pswd.sendKeys("Admin123");
	}

	@And("Select the isolation ward")
	public void clickWard() {
		WebElement wardType = locateElement("id", "Isolation Ward");
		wardType.click();
	}

	@And("Click the login")
	public void login() {
		WebElement login = locateElement("id", "loginButton");
		login.click();
	}
		//need to validate login success or not
	@And("Then validate login is success")
	public void validateadmin() {
		String val = locateElement("xpath", "//div[@id='content']//h4").getText();
		Assert.assertTrue(val.contains("Super User (admin)"));
	}
		
		
	/*
	 * //Negative Scenario
	 * 
	 * @Then("Invalid Username") public void invalidUsername() { WebElement
	 * InvalidUserName = locateElement("id","username");
	 * InvalidUserName.sendKeys("ADMIN");
	 * 
	 * }
	 * 
	 * @And("Enter the Password") public void password() { WebElement pswd =
	 * locateElement("id", "password"); pswd.sendKeys("admin123"); }
	 * 
	 * @And("Click the Isolation ward") public void Isolationward() { WebElement
	 * Iswrd = locateElement("id","Isolation Ward" ); Iswrd.click(); } public void
	 * login1() { WebElement log1 = locateElement("id", "loginButton");
	 * log1.click();
	 * 
	 * }
	 */
	}


