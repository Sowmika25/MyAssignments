package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
	    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    WebElement link =
	    String linktext = link.getText();
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(linktext);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    WebElement message = driver.findElement(By.xpath("//div[text()='No records to display']"));
	    String givenmsg ="No records to display";
	    if(message.equals(givenmsg))
	    	System.out.println("Expected Message is displayed");
	    else
	    	System.out.println("Expected Message is displayed");
	    driver.close();
	    
	    
	    
	    
	      
	    
	   
	    
	}

}
