package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedXpath {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
	    driver.findElement(By.partialLinkText("CRM")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Stud3 Account");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("numberEmployees")).sendKeys("10");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title= driver.getTitle();
	    System.out.println(title);
	    String givenTitle = "Account Details | opentaps CRM";
	    if(title.equals(givenTitle))
	    	System.out.println("Title is displayed correctly");
	    else
	    	System.out.println("Title is not displayed correctly");
	    driver.close();
	}

}
