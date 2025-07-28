package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceStaticParam {
	
	public RemoteWebDriver driver;
	
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void preLogin(String url , String username , String password) {
	
	driver = new ChromeDriver();
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys(username);
    driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys(password);
    driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	
	}
	   
	   @Test
	   public void addLegalEntity() {
		
        driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        WebElement ele = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        Actions act = new Actions(driver);
        act.scrollToElement(ele).perform();
        ele.click();
        //driver.findElement(By.xpath("(//*[name()='svg' and @class='slds-icon slds-icon-text-default slds-icon_xx-small'])[4]")).click();
        driver.findElement(By.xpath("//a[@title='New']")).click();
       // driver.findElement(By.xpath("//span[text()='New Legal Entity']")).click();
        driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
        WebElement status=driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
        //act.scrollToElement(status).perform();
        //status.click();
        // Scroll into view and click
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", status);
        js.executeScript("arguments[0].click();", status);
        driver.findElement(By.xpath("//span[@title='Active']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String alert = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[1]")).getText();
        if(alert.isEmpty())
        {
        	System.out.println("Alert message not displayed");
        }
        else
        {
        	System.out.println("Alert message displayed successfully");
        }
	}
	   
	   @AfterMethod
	   public void postlogin() {
		   
		   driver.close();
	   }
	

}
