package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass2 extends AbstractTestNGCucumberTests{
	
	public static ChromeDriver driver;
	public ChromeOptions options;
	public static JavascriptExecutor js;
	
	@BeforeMethod
	public void precodn() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Sales@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        Thread.sleep(2000);
        js = (JavascriptExecutor)driver;
        WebElement accclick=driver.findElement(By.xpath("//a[@title='Accounts']/span"));
        js.executeScript("arguments[0].click();",accclick);
	}
	
	@AfterMethod
	public void postCondn() {
		driver.close();
		
	}
	

}
