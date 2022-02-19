package Day_4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownTest {
	

	WebDriver driver;
	WebDriverWait wait;
	
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "https://the-internet.herokuapp.com/dropdown");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@Test
	public void staticdropdown() throws InterruptedException {
		
		WebElement staticdropdown = driver.findElement(By.id("dropdown"));
		
		Select select = new Select(staticdropdown);
		
		select.selectByIndex(1);
		
		Thread.sleep(3000);
		
		select.selectByValue("2");
		Thread.sleep(3000);
		
		select.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		
		
		
		
		
	}
}
