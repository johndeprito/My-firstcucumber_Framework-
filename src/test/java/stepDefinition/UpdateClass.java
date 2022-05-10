package stepDefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Wrapper.Wrapperclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UpdateClass extends Wrapperclass {
	//Click Edit
	@And("Click the Edit button")
	public void edit() {
		WebElement edit = locateElement("linkText", "Edit");
		edit.click();
	}
	//update the existing given data
	@And("Clear the giveName & Replace the another Name you want")
	public void update() {
		WebElement replace = locateElement("xpath", "//input[@name='givenName']");
		replace.clear();
		replace.sendKeys("JDP");
	}
	//Clear the middleName
	@And("Clear the middleName")
	public void mid() {
		WebElement middle = locateElement("xpath", "//input[@name='middleName']");
		middle.clear();
		}
	//Save the update record
	@Then("Save Form")
	public void save() {
		WebElement saveR = locateElement("linkText", "Save Form");
		saveR.click();
	}
	//submit the record
	@And("Submit the update record")
	public void submit() {
		WebElement submt = locateElement("xpath","//button[@id='registration-submit']");
		submt.click();
	}
}
