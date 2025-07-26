package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajio {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags",Keys.ENTER);
	    driver.findElement(By.xpath("//span[text()='FILTERS']/following::input[1]"));
	    driver.findElement(By.xpath("//input[@placeholder='Search for Categories']/following::input[2]")).click();
	    String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
	    System.out.println(count);
	    List<WebElement>brands= driver.findElements(By.xpath("//h3[@class='product-brand']"));
	    for(WebElement iter : brands) {
	    	  System.out.println(iter.getText());
	    }
	    System.out.println("---------------------------------------------");
	    List<WebElement>names = driver.findElements(By.xpath("//h4[@class='product-product']"));
	    for(WebElement inam : names) {
	    	System.out.println(inam.getText());
	    }
	    
	    
		
		
	}

}
