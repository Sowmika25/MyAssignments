package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
	    //Thread.sleep(500);
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CTS");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sai");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Pallavi");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("SP");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
	    driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation Tester");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abcd@gmail.com");
	    WebElement ele = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	    Select sel = new Select(ele);
	    sel.selectByVisibleText("California");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("testsample");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	}

}
