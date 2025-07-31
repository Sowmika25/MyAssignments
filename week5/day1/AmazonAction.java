package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus 13 pro",Keys.ENTER);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		act.moveToElement(ele).perform();
		String price = ele.getText();
		System.out.println(price);              
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
        String ratings =driver.findElement(By.xpath("(//h2[@id='acr-popover-title'])/span[2]")).getText();
		System.out.println(ratings);
		String ratingscustcount = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']")).getText();
		System.out.println(ratingscustcount);
	    driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']/span[1]")).click();
	    File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File store = new File("./snapshot/oneplusphone.png");
		FileUtils.copyFile(screenshot, store);
		Thread.sleep(2000);
	    WebElement ele3=driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
	    act.scrollToElement(ele3).perform();
	    ele3.click();
	    driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
	    Thread.sleep(3000);
		String tot1=driver.findElement(By.xpath("(//span[@class='a-price a-text-price sc-product-price sc-white-space-nowrap a-size-medium']/span[2])[1]")).getText();
		tot1=tot1.replaceAll("\\D","");
		int tot11 = Integer.parseInt(tot1);
		String origsubtot = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")).getText();
		origsubtot=origsubtot.replaceAll("\\D","");
		int origsubtotal = Integer.parseInt(origsubtot);
		if(tot11==origsubtotal) {
			System.out.println("Total displayed correctly");
		}
		else {
			System.out.println("Total not displayed correctly");
		}
		
		driver.close();
		
				
				
				
				
				
		
		
		
		
	}

}
