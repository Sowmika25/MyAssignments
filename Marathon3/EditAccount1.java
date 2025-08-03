package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class EditAccount1 extends BaseClass1 {
	
	@BeforeTest
	public void setValues2() {
		excelFileName="EditAccount";
	}

    @Test(dependsOnMethods= {"Marathon3.CreateAccount1.learnCreateAccount"},dataProvider="fetchData",alwaysRun=true)
    public void learnEditAccount(String accName , String billStreet , String shipStreet) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accName + Keys.ENTER);
        Thread.sleep(2000);
        WebElement editclick=driver.findElement(By.xpath("(//table[contains(@class,'table_header-fixed ')]//tr[1]//td[6])//button"));
        js.executeScript("arguments[0].click();",editclick);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Edit']")).click(); 
        WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
        js.executeScript("arguments[0].click()",typeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click(); 
        WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
        js.executeScript("arguments[0].click()",industryDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
        WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
        biilingStreet.clear();
        biilingStreet.sendKeys(billStreet);
        WebElement shippingStreet = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        shippingStreet.clear();
        shippingStreet.sendKeys(shipStreet);
        WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
        driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
        WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
        driver.executeScript("arguments[0].click()",activeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        int randomNum1 = (int)(Math.random()*999999);
        int randomNum2 = (int)(Math.random()*999999);
        String phno = ""+randomNum1+randomNum2;
        phno = phno.substring(0,10);
        System.out.println(phno);
        WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phno);
        WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(2000);
        String phnoStr = driver.findElement(By.xpath("(//table/tbody/tr[1]/td[4])//a")).getText();
        System.out.println(phnoStr);
        Assert.assertTrue(phnoStr.equals(phno),"verify the mobileNumber");
        



    }

}


