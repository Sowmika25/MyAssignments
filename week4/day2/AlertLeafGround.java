package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLeafGround {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Prompt Alert");
		String acttext= alert.getText();
		System.out.println(acttext);
		String exptext ="Prompt Alert";
		if(acttext.equals(exptext)) {
			System.out.println("Alert popup displayed, dismiss and text entered done successfully");
		}
		else
		{
			System.out.println("Alert popup text not entered successfully");
		}
		alert.dismiss();
		

	}

}
