package AdvancedMarathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"));
		act.moveToElement(ele1).perform();
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		WebElement ele2 = driver.findElement(By.xpath("(//select[@class='SelectBoxDesktop__hideSelect'])[1]"));
		Select sel = new Select(ele2);
		sel.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement>pricelst = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		for(WebElement iter : pricelst) {
			String price = iter.getText();
			System.out.println(price);
		}
		WebElement orig2price = pricelst.get(0);
		String origprice2 = orig2price.getText();
        driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		Set<String>wh=driver.getWindowHandles();
		List<String>lw= new ArrayList<String>(wh);
		driver.switchTo().window(lw.get(1));
		String origprice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText(); 
		String[]origprice1= origprice.split(" ");
		String realorigprice1 = origprice1[1];
		System.out.println(realorigprice1);
		if(realorigprice1.equals(origprice2)) {
			System.out.println("Prices are equal");
		}
		else {
			System.out.println("Prices are not equal");
		}
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		String cartct = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(cartct);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(7000);
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		File store = new File("./snapshot/watch.png");
		FileUtils.copyFile(screenshot, store);
		driver.close();
		driver.switchTo().window(lw.get(0));
		driver.close();
		
		
	}

}
