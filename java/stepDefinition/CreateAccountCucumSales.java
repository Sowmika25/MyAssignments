package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountCucumSales extends BaseClass2 {
	
	public static String ACCOUNTNAME;

	@When("Click on the New button")
	public void click_on_the_new_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='New']")).click();
		Thread.sleep(2000);
	}

	@When("enter the name as (.*)$")
	public void enter_the_name_as(String accname) {
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accname);
		ACCOUNTNAME = accname;
	}

	@When("select ownership as public")
	public void select_ownership_as_public() throws InterruptedException {
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@title='Public']")).click();
	}
	
	@Then("click save button and verify account name")
	public void click_save_button_and_verify_account_name() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(ACCOUNTNAME),"Verify the Account name");
	}



	
}
