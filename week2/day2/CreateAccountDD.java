package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDD {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("AccountSam");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    WebElement ele = driver.findElement(By.name("industryEnumId"));
	    Select sel = new Select(ele);
	    sel.selectByIndex(3);
	    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    Select sel1 = new Select(ownershipDD);
	    sel1.selectByVisibleText("S-Corporation");
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    Select sel2 = new Select(sourceDD);
	    sel2.selectByValue("LEAD_EMPLOYEE");
	    WebElement campaignDD = driver.findElement(By.id("marketingCampaignId"));
	    Select sel3 = new Select(campaignDD);
	    sel3.selectByIndex(6);
	    WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select sel4 = new Select(stateDD);
	    sel4.selectByValue("TX");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	    driver.findElement(By.className("smallSubmit")).click();
	    //verify the account name
	    String fullaccname = driver.findElement(By.xpath("//span[text()='Account Name']//following::span[1]")).getText();
	    String accname = fullaccname.split("\\(")[0];
	    System.out.println(accname);
	    String givenaccname = "AccountSam";
	    if(givenaccname.equals(accname))
	    	System.out.println("Account Name is displayed correctly");
	    else
	    	System.out.println("Account Name is not displayed correctly");
	    
	    
	    driver.close();
	    
	    
	}

}
