package hooksimplementation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksLeaftaps extends BaseClass3 {
	
	@Before
	public void precondn() throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
	driver = new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.xpath("//a[text()='Accounts']")).click();
	 
	}
	
	@After
	public void postcondn() {
		driver.close();
	}

}
