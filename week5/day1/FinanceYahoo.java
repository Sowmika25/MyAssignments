package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

 public static void main(String[] args) {
	 
		 ChromeDriver driver = new ChromeDriver();
			driver.get("https://finance.yahoo.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			WebElement ele = driver.findElement(By.xpath("//span[text()='More']"));
			Actions builder=new Actions(driver);
			builder.moveToElement(ele).perform();
			driver.findElement(By.xpath("(//a[contains(text(),'Crypto')])[3]")).click();
			List<WebElement> cryptoNames = driver.findElements(By.xpath("(//table[@class='yf-ao6als bd']/tbody/tr/td[2])/div"));
			int totalNames = cryptoNames.size();
			System.out.println(totalNames);
			for (WebElement list : cryptoNames) {
				System.out.println(list.getText());
			}
			driver.close();
			}

		
		
	}


