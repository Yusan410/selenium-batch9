package Day_4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "https://www.makemytrip.com");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	@Test
	public void test1() throws InterruptedException {
		
		driver.findElement(By.id("root")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/label/input")).click();		
		
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@role=\"option\"]//p")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("jfk");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
        Thread.sleep(2000);
        
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("iah");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[7]")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
        
        
		
	}
	@After
	public void testt() throws InterruptedException {
		
		driver.close();
		
		Thread.sleep(4000);
		
		System.out.println("Test complete");
	}

}
