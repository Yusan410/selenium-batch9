package Day_5;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestCase {
	
	WebDriver driver;
	@Before
	public void beforemethod() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		
		
	}
	@Test
	public void test() throws InterruptedException {
		
driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Messi");

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"JTPWx\"]/span[5]/span")).click();


Thread.sleep(2000);
		
		
		
		
	}

}
