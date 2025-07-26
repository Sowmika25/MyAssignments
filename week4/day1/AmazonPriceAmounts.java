package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPriceAmounts {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("MobilePhones",Keys.ENTER);
		List<WebElement>priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<String>priceamount = new ArrayList<String>();
		for(WebElement each : priceList)
		{
			String pricetext = each.getText();
			priceamount.add(pricetext);
		}
		System.out.println(priceamount);

	}

}
