package Marathon;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marathon1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.pvrcinemas.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click(); 
	    driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
	    driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click();
	    driver.findElement(By.xpath("//span[@class='seat-current-pvr']")).click();
	    driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
	    String seatinfo=driver.findElement(By.xpath("//div[@class='ticket-value']/p")).getText();
	    String seatnumber= driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
	    System.out.println(seatinfo+"\t"+ seatnumber);
        String grandtotal= driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span")).getText();
	    System.out.println("Rs."+ grandtotal);
	    driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
	    driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    
	    
	    
	    
	  
	    
	  }

}
