package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWindowHandle {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String>wh = driver.getWindowHandles();
		List<String>lw = new ArrayList<String>(wh);
		driver.switchTo().window(lw.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(lw.get(0));
		driver.close();
		
	}

}
