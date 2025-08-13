package stepDefinition;

import org.openqa.selenium.By;

import hooksimplementation.BaseClass3;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccLeaf extends BaseClass3 {
    

	@When("user click on the find accounts")
	public void user_click_on_the_find_accounts() {
	    driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}


	@When("user enter the account name as (.*)$")
	public void user_enter_the_account_name_as(String accnameedit) {
	    driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys(accnameedit);
	}

	@When("user click on the find account")
	public void user_click_on_the_find_account() throws InterruptedException {
	    driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	    Thread.sleep(5000);
	}

	@When("click on the first resulting account name")
	public void click_on_the_first_resulting_account_name() {
	    driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td[1])//a")).click();
	}

	@When("click on the edit button")
	public void click_on_the_edit_button() {
	   driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}

	@When("enter the description as (.*)$")
	public void enter_the_description_as(String des) {
	    driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys(des);
	}

	@Then("click on the save button")
	public void click_on_the_save_button() {
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	

	


}
