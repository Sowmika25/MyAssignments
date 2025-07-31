package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableActivity {

	private static CharSequence duplicate;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[2]/td[1]/input")).clear();
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[2]/td[1]/input")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[2]/td[3]/input")).clear();
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[2]/td[3]/input")).sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[1]/td[6]/input")).click();
		
		List<WebElement> rowsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int rs = rowsize.size()-1;
		List<WebElement>colsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[1]/th"));
		int cs=colsize.size();
		int i;
		String trainnames = null;
		for(i=2;i<=rs;i++)
		{
		
		        trainnames=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
		        System.out.println(trainnames);
		        
		}
		
		
	}

	
}
