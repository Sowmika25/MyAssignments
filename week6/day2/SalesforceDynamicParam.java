package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesforceDynamicParam {

public RemoteWebDriver driver;

     @DataProvider(name="fetchData")
     public String[][] sendData(){
	   String [][]data = new String [4][1];
	   data[0][0]="Sowmika11";
	   data[1][0]="Nithya11";
	   data[2][0]="Selva11";
	   data[3][0]="Preethi11";
	   
	   return data;
}
	
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
	   
	   @Test(dataProvider="fetchData")
	   public void addLegalEntity(String lname) {
		
        driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        WebElement ele = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        Actions act = new Actions(driver);
        act.scrollToElement(ele).perform();
        ele.click();
        driver.findElement(By.xpath("//a[@title='New']")).click();
        driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation By "+lname+"");
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String legalentname = driver.findElement(By.xpath("(//lightning-formatted-text[@data-output-element-id='output-field'])[1]")).getText();
        if(legalentname.equals("Salesforce Automation By "+lname+"")) {
        	System.out.println("Legal entity name added successfully");
        }
        else
        {
        	System.out.println("Legal entity name not added successfully");
        }
		
        
	   }
	   
	  
	   @AfterMethod
	   public void postlogin() {
		   
		   driver.close();
	   }
	


}
