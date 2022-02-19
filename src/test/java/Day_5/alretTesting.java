package Day_5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alretTesting {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "https://the-internet.herokuapp.com/javascript_alerts");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	@Test
	public void test2() {
		
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		
		 String test2 = driver.switchTo().alert().getText();
	        System.out.println(test2);
	        driver.switchTo().alert().dismiss();
	    
		
		
		
	}
	@Test
	public void test3() {
		
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		
		String thirdAlertText = driver.switchTo().alert().getText();
		
		
        System.out.println(thirdAlertText);
		
		
		String name = "Ali";
		
		
		 driver.switchTo().alert().sendKeys(name);
		 
		 driver.switchTo().alert().accept();
		
		
		String actualname = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		
		if(actualname.contains(name)) {
			
			
			System.out.println("Test Pass!!");
			/*
			 * 
			 * /   Alret//
			 */
			//switchto.alret.accept
		}
		
		
	}
	
	
}
