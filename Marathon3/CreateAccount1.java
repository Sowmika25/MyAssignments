package Marathon3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount1 extends BaseClass1{
	
	@BeforeTest
	public void setValues1() {
		excelFileName="CreateAccount";
	}
    @Test(dataProvider="fetchData")
    public void learnCreateAccount(String accName) throws InterruptedException {
        driver.findElement(By.xpath("//a[@title='New']")).click();
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accName);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@title='Public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(accName),"Verify the Account name");
        
    }

}
