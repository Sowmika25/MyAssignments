package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DeleteAccount1 extends BaseClass1 {
	
	@BeforeTest
	public void setValues3() {
		excelFileName="DeleteAccount";
	}

   
	@Test(dependsOnMethods= {"Marathon3.CreateAccount1.learnCreateAccount","Marathon3.EditAccount1.learnEditAccount"},dataProvider="fetchData",alwaysRun=true)
    public void learnDeleteAccount(String accName) throws InterruptedException {
        
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accName + Keys.ENTER);
        Thread.sleep(2000);
        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s = noOfItems.split(" ");
        String ctbd = s[0];
        ctbd.replaceAll("\\D","");
        int countBeforeDelete = Integer.parseInt(ctbd);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement delclick=driver.findElement(By.xpath("//a[@title='Delete']/div"));
        js.executeScript("arguments[0].click();",delclick);
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        Thread.sleep(2000);
        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s1 = noOfItems.split(" ");
        String ct = s1[0];
        ct.replaceAll("\\D","");
        int countAfterDelete = Integer.parseInt(ct);
        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");
        

    }


}

