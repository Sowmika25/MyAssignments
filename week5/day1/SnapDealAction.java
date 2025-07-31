package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealAction {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoect= driver.findElement(By.xpath("(//div[@class='child-cat-count '] )[1]")).getText();
		System.out.println(shoect);
		driver.findElement(By.xpath("//div[text()='Training Shoes'] ")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		// check displayed item sort correctly
		 WebElement priceRangeFrom = driver.findElement(By.xpath("//input[@name='fromVal']"));
			priceRangeFrom.clear();
			priceRangeFrom.sendKeys("500");
			WebElement priceRangeTo = driver.findElement(By.xpath("//input[@name='toVal']"));
			priceRangeTo.clear();
			priceRangeTo.sendKeys("700");
			driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
			WebElement cli = driver.findElement(By.xpath("//a[text()=' White & Blue']"));
			JavascriptExecutor js3 =(JavascriptExecutor) driver;
			js3.executeScript("arguments[0].click();", cli);
			Thread.sleep(3000);
			String verifyFilter = driver.findElement(By.xpath("//div[@class='filters']")).getText();
			System.out.println(verifyFilter);
			if (verifyFilter.contains(" White & Blue") && verifyFilter.contains("Rs. 500 - Rs. 700")) {
				System.out.println("Filter applied successfully");
			} else {
				System.out.println("Filter not applied");
			}
		WebElement ele1=driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		act.moveToElement(ele1).perform(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		String fullamt = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String[] amt = fullamt.split("&");
		System.out.println(amt[0]);
		String discount= driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discount);
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File store = new File("./snapshot/shoes.png");
		FileUtils.copyFile(screenshot, store);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		Thread.sleep(1500);
		driver.close();
		
	}

}
