package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountCucumSales extends BaseClass2 {
	
    @Given("search for the account name as Prem")
	public void search_for_the_account_name_as_prem() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Prem" + Keys.ENTER);
		Thread.sleep(2000);
	}

	@When("click the dropdown icon select edit")
	public void click_the_dropdown_icon_select_edit() throws InterruptedException {
		WebElement editclick=driver.findElement(By.xpath("(//table[contains(@class,'table_header-fixed ')]//tr[1]//td[6])//button"));
        js.executeScript("arguments[0].click();",editclick);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Edit']")).click(); 
	}

	@When("set type to Technology partner")
	public void set_type_to_technology_partner() {
		WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
        js.executeScript("arguments[0].click()",typeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click(); 
	}

	@When("set industry to healthcare")
	public void set_industry_to_healthcare() {
		WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
        js.executeScript("arguments[0].click()",industryDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
	}

	@When("enter the billing address as {string}")
	public void enter_the_billing_address_as(String billStreet) {
		WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
        biilingStreet.clear();
        biilingStreet.sendKeys(billStreet);
	}

	@When("enter the shipping address as {string}")
	public void enter_the_shipping_address_as(String shipStreet) {
		WebElement shippingStreet = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        shippingStreet.clear();
        shippingStreet.sendKeys(shipStreet);
	}

	@When("set customer priority to low")
	public void set_customer_priority_to_low() {
		WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
	}

	@When("set SLA to Silver")
	public void set_sla_to_silver() {
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	}

	@When("set active to No")
	public void set_active_to_no() {
		WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
        driver.executeScript("arguments[0].click()",activeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@When("enter unique phone number as {string}")
	public void enter_unique_phone_number_as(String phnum) {
		WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phnum);
	}

	@When("set upsell opportunity to No")
	public void set_upsell_opportunity_to_no() {
		WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}

	@Then("click save verify phone number")
	public void click_save_verify_phone_number() throws InterruptedException {
		String phno="9344460167";
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(2000);
        String phnoStr = driver.findElement(By.xpath("(//table/tbody/tr[1]/td[4])//a")).getText();
        System.out.println(phnoStr);
        Assert.assertTrue(phnoStr.equals(phno),"verify the mobileNumber");
        
	}



}
