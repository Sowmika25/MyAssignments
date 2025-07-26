package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMarathon1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys",Keys.ENTER);
		String fulltext=driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")).getText();
		System.out.println(fulltext);
		String[] results = fulltext.split(" ");
		System.out.println(results[3]);
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String productname=driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")).getText();
		System.out.println(productname);
		String discountprice=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(discountprice);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		

		

	}

}
