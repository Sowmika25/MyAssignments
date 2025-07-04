package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDD {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nirmala");
		driver.findElement(By.name("lastname")).sendKeys("nirmal");
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sel = new Select(dayDD);
		sel.selectByVisibleText("16");
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sel1 = new Select(monthDD);
		sel1.selectByIndex(6);
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sel2 = new Select(yearDD);
		sel2.selectByValue("1998");
		driver.findElement(By.name("reg_email__")).sendKeys("sample@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Sample@123");
		driver.findElement(By.xpath("//input[@value=1]")).click();
		
		
	}

}
