package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSampleFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String actualResult = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expResult = "You pressed OK!";
		if(actualResult.equals(expResult))
		{
			System.out.println("Action is performed correctly");
		}
		else
		{
			System.out.println("Action is not performed correctly");
		}
		
		

	}

}
