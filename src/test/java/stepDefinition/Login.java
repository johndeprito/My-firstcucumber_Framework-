package stepDefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.io.IOException;

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
	@Then("Enter {string} in username")
	public void enterUsername(String userName) {
		WebElement uName = locateElement("id", "username");
		uName.sendKeys(userName);
	}

	@And("Enter {string} in password")
	public void enterPassword(String password) {
		WebElement passcode = locateElement("id", "password");
		passcode.sendKeys(password);
	}

	@And("Select the {string}")
	public void clickWard(String ward) {
		WebElement wardType = locateElement("id", "Isolation Ward");
		wardType.click();
	}

	@And("Click the login")
	public void login() {
		WebElement login = locateElement("id", "loginButton");
		login.click();
	}

	// need to validate login success or not
	/*
	 * @Then("Validate login is success") public void validateadmin() { String val =
	 * locateElement("xpath", "//div[@id='content']//h4").getText();
	 * Assert.assertTrue(val.contains("Super User (admin)")); }
	 */

	// Negative Scenario

	@Then("Enter the Invalid Username")
	public void invalidUsername() {
		WebElement InvalidUserName = locateElement("id", "username");
		InvalidUserName.sendKeys("ADMIN");

	}

	@And("Enter the Invalid Password")
	public void password() {
		WebElement pswd = locateElement("id", "password");
		pswd.sendKeys("admin123");
	}

	@And("select the Isolation ward")
	public void Isolationward() {
		WebElement Iswrd = locateElement("id", "Isolation Ward");
		Iswrd.click();
	}

	@And("click the login")
	public void login1() {
		WebElement log1 = locateElement("id", "loginButton");
		log1.click();
		
	}
	/*
	 * @Then("verify error message is getting displayed") public void errmessage() {
	 * String errmessage =
	 * locateElement("xpath","//i[@class='icon-exclamation-sign']").getText();
	 * Assert.assertTrue(errmessage.contains("Invalid username/password")); }
	 */

}
