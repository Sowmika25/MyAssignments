package AdvancedMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNowOrderMobile {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://dev209663.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("qy/Q6A=vOM3x");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(10);
		sh.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		sh.setImplicitWait(10);
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		sh.setImplicitWait(10);
		//nested shadow root
		WebElement frameele=sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameele);
		WebElement mobele= sh.findElementByXPath("//h2[contains(text(),'Mobiles')]");
		Actions act = new Actions(driver);
		act.scrollToElement(mobele).perform();
		mobele.click();
		sh.setImplicitWait(10);
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
		WebElement ele = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Unlimited [add $4.00]");
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']"));
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		String msg=driver.findElement(By.xpath("//div[@class='notification notification-success']/span[2]")).getText();
		if(msg.isEmpty())
		{
			System.out.println("Order is not placed");
		}
		else
		{
			System.out.println("Order is placed successfully");
		}
		String reqno = driver.findElement(By.xpath("//a[@class='linked requestItemUrl']/b")).getText();
		System.out.println(reqno);
		driver.close();
		
		
	}

}
