package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Shop by'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		ele.click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		act.moveToElement(ele2).perform();
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		act.scrollToElement(ele3).perform();
		ele3.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")).click();
		Set<String>wh = driver.getWindowHandles();
		List<String>lw= new ArrayList<String>(wh);
		driver.switchTo().window(lw.get(1));
		Thread.sleep(2000);
		WebElement scroll=driver.findElement(By.xpath("//span[text()='5 kg']"));
		act.scrollToElement(scroll).perform();
		Thread.sleep(2000);
		scroll.click();
		Thread.sleep(1000);
		String price = driver.findElement(By.xpath("//h1[text()='bb Royal Tamil Ponni Boiled Rice, 5 kg (12-17 Months Old)']/following::td[3]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		Thread.sleep(2000);
		String origmsg = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		String expmsg = "An item has been added to your basket successfully";
		if(origmsg.equals(expmsg)) {
			System.out.println("Message displayed successfully");
		}
		else {
			System.out.println("Message not displayed successfully");
		}
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File store = new File("./snapshot/rice.png");
		FileUtils.copyFile(screenshot, store);
		driver.close();
		driver.switchTo().window(lw.get(0));
		driver.close();
		
		

	}

}
