package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmika");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead Product");
	    driver.findElement(By.name("submitButton")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    String givenTitle="View Lead | opentaps CRM";
	    if(title.equals(givenTitle))
	    	System.out.println("Title is displayed correctly");
	    else
	    	System.out.println("Title is not displayed correctly");
	    driver.close();
	    }

}
