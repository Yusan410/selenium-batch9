package Day_7;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework {
	
//	 1. go to http://automationpractice.com/index.php
//		    2. click on DRESSES button
//		    3. add items on sale to cart and checkout
//		    4. continue to checkout until you see the 'authentication' page and verify it
	
	
	WebDriver driver;
	
	@Before
	public void beforemetho() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
	}
	@Test
	public void shopping() throws InterruptedException {
		
	
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		
		String result = "//*[@id=\"center_column\"]/ul/li";
		
		List<WebElement> eachitem = driver.findElements(By.xpath(result));
	
	
	
	}
	
}	
		
		
			
			
			
			
		
			


