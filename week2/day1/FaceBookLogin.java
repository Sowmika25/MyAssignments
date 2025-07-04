package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement ip = driver.findElement(By.id("email"));
		ip.sendKeys("testleaf@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
