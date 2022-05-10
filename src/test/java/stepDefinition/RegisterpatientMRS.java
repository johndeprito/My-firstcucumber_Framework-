package stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Wrapper.Wrapperclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterpatientMRS extends Wrapperclass {
	// Register a patient
	@Given("Click the {string}")
	public void Registerpatient(String Register) {
		System.out.println(Register);
		WebElement reg = locateElement("linkText", Register);
		reg.click();
	}
	
	// Enter the first name  
	@And("Enter the firstName")
	public void fName() {
		WebElement gname = locateElement("xpath", "//input[@name = 'givenName']");
		gname.sendKeys("JD");
	}

	// Enter the mid name
	@And("Enter the mid name")
	public void midname() {
		WebElement mid = locateElement("xpath", "//input[@name = 'middleName']");
		mid.sendKeys(" ");
	}

	// Enter the family_name
	@And("Enter the familyname")
	public void familyname() {
		WebElement fName = locateElement("xpath", "//input[@name = 'familyName']");
		fName.sendKeys("Prito");
	}

	// Enter the last_name
	/*
	 * @And("nxt btn") public void nxtbtn() { WebElement nxt = locateElement("id",
	 * "next-button"); nxt.click();
	 }*/

	
	// drop-down select in gender
	@Then("Select the gender")
	
	public void generation() {
		WebElement gen = locateElement("id", "gender-field");
		Select genderSelection = new Select(gen);
		genderSelection.selectByValue("M");
	}

	// click the next
	@And("Click the next button")
	public void nxt() {
		WebElement nxtbtn = locateElement("id", "next-button");
		nxtbtn.click();
	}

	// Birthday
	@And("Enter the patient Date of Birth date")
	public void bdy() {
		WebElement day = locateElement("id", "birthdateDay-field");
		day.sendKeys("14");
	}

	// Born month select
	@And("Select a month")
	public void bmnth() {
		WebElement mnts = locateElement("name", "birthdateMonth");
		Select monthsSelection = new Select(mnts);
		monthsSelection.selectByVisibleText("October");
	}

	// Enter the born year
	@Then("Enter the year of Date of Birth")
	public void year() {
		WebElement yr = locateElement("id", "birthdateYear-field");
		yr.sendKeys("1994");
	}

	// Go to the next step
	/*
	 * @And("Click the next button") public void next() { WebElement nxt =
	 * locateElement("id", "next-button"); nxt.click(); }
	 */
	// Enter the valid Address
	@And("Enter the valid Address1")
	public void address() {
		WebElement add = locateElement("id", "address1");
		add.sendKeys("2 10th cross");
	}

	// Enter the address2
	@And("Enter the Address2")
	public void address2() {
		WebElement add = locateElement("id", "address2");
		add.sendKeys("Periyarnagar");
	}

	// Enter the city name
	@And("Enter the city name")
	public void cityName() {
		WebElement cty = locateElement("id", "cityVillage");
		cty.sendKeys("Nellithope");
	}

	// Enter the state
	@And("Enter the state")
	public void stateName() {
		WebElement ste = locateElement("id", "cityVillage");
		ste.sendKeys("Cny");
	}

	// Enter the country
	@And("Enter the Country")
	public void countryName() {
		WebElement cnty = locateElement("id", "country");
		cnty.sendKeys("India");
	}

	// Enter the Postal_code
	@And("Enter the Postal Code")
	public void pCode() {
		WebElement pstcode = locateElement("id", "postalCode");
		pstcode.sendKeys("605005");
	}

	// click to the next
	@And("Click to the next")
	public void rNext() {
		WebElement nxt = locateElement("id", "next-button");
		nxt.click();
	}

	// Enter the Mobile Number
	@And("Enter the Valid patient phone number")
	public void mNumber() {
		WebElement mNumber = locateElement("name", "phoneNumber");
		mNumber.sendKeys("96299962946");
	}

	// Click to the Next button
	@And("CLick next")
	public void Pnext() {
		WebElement pNext = locateElement("id", "next-button");
		pNext.click();
	}

	// Mention the patient relation type
	@And("Select any one given relationship type in dropdown")
	public void relationtype() {
		WebElement rtype = locateElement("id", "relationship_type");
		rtype.click();
		Select reltype = new Select(rtype);
		reltype.selectByVisibleText("Parent");
	}

	// Releations_name
	@Then("Enter the person name")
	public void rtype() {
		WebElement abc = locateElement("xpath", "//input[contains(@class,'person-typeahead')]");
		abc.sendKeys("Father");
	}

	// click the confirm
	@And("Click the Confirm button")
	public void confirm() {
		WebElement cnfm = locateElement("id", "submit");
		cnfm.click();
	}

	// verify the givenName
	@And("Validate the given Name")
	public void validateUname() {
		String val = locateElement("xpath", "//span[contains(@class,'PersonName-givenName')]").getText();
		Assert.assertTrue(val.contains("JD"));
	}
}
