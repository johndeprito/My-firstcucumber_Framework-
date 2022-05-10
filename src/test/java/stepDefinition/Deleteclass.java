package stepDefinition;

import org.openqa.selenium.WebElement;

import Wrapper.Wrapperclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Deleteclass extends Wrapperclass {
	//click the Delete button
	@Given("Click the Delete patient link")
	public void delete() {
		WebElement deleteR = locateElement("xpath", "(//div[contains(@class,'col-11 col-lg-10')])[8]");
		deleteR.click();
	}
	//mention the reason for delete
	@And("Enter the reason")
	public void reason(){
		WebElement reasonR = locateElement("xpath","//input[@id='delete-reason']");
		reasonR.click();
		reasonR.sendKeys("Invalid Record");
		}
	//Click Confirm button
	@And("Click the confirm")
	public void submit() {
		WebElement submitR = locateElement("xpath", "(//button[@class='confirm right'])[6]");
		submitR.click();
	}
	

}
