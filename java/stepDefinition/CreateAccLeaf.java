package stepDefinition;

import org.openqa.selenium.By;

import hooksimplementation.BaseClass3;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccLeaf extends BaseClass3 {
	

	@When("User clicks on the create account")
	public void user_clicks_on_the_create_account() {
	    driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	}

	@When("enter the account name as (.*)$")
	public void enter_the_account_name_as(String accnamecreate) {
	    driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(accnamecreate);
	}

	@Then("click on create account")
	public void click_on_create_account() {
	    driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	}

	
	
}
