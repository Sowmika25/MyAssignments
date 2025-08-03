package Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcases.CommonIntegrationExcel;

public class BaseClass1 {
	
	public RemoteWebDriver driver;
	public JavascriptExecutor js;
	
	public String excelFileName;
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return CommonIntegrationExcel.readData(excelFileName);
		
	}
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void precondn(String url , String uname , String pswd) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pswd);
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        Thread.sleep(2000);
        js = (JavascriptExecutor)driver;
        WebElement accclick=driver.findElement(By.xpath("//a[@title='Accounts']/span"));
        js.executeScript("arguments[0].click();",accclick);
	}
	
	@AfterMethod
	public void postcondn() {
		driver.close();
	}

}
