package Review;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class satReview {
	
	WebDriver driver;
	
	String myname = " ";
	
	@Before
	public void beforemethod() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
	}
	@Test
	public void test () {
		
		driver.findElement(By.name("q")).sendKeys("messi" , Keys.ENTER);
		
		WebElement  result = driver.findElement(By.xpath("//*[@id='result-stats']"));
		
		System.out.println(result.getText());
		
		
		
		
		
		
		
	}
		
		
		
	}
	
	
	
	 


