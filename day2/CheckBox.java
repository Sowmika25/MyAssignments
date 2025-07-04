package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.get("https://leafground.com/checkbox.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	    driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][1]")).click();
	    driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][2]")).click();
	    WebElement ele= driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		if(ele.isDisplayed())
			System.out.println("Expected message is displayed");
		else
			System.out.println("Expected message is not displayed");
	    driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][3][2]")).click();
	    WebElement tristateCB = driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']//following::div")).click();
	    if(tristateCB.isSelected())
	    	System.out.println("Tristate Check Box is selected");
	    else
	    	System.out.println("Tristate Check Box is not selected");
	    driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	    WebElement ele1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
	    if(ele1.isDisplayed())
	    	System.out.println("Expected message is displayed");
	    else
	    	System.out.println("Expected message is not displayed");
	    WebElement CBDisab= driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'][3]"));
	    if(CBDisab.isEnabled())
	    	System.out.println("Check box is enabled");
	    else
	    	System.out.println("Check box is disabled");
	    driver.findElement(By.xpath("//ul[contains(@class='selectcheckboxmenu-multiple-container')")).click();
	    driver.findElement(By.xpath("//li[@data-item-value='Miami']//div[1][2]")).click();
	    driver.findElement(By.xpath("//li[@data-item-value='Berlin']//div[1][2]")).click();
	    driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']//div[1][2]")).click();
	    
	    driver.close();
	    
	    
	    
	
	    
	    

	}

}
