package Day_7;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	
	WebDriver driver;
	
	@Before
	public void beforemetho() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http:www.amazon.com");
		
		
	}
	@Test
	public void test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("ronaldo jersey", Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement>  result1 = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]//div"));
		
		for(int i = 8; i < result1.size(); i++) {
			
			WebElement eachprice = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div["+ i +"]/div/div/div/div/div[2]/div[4]/div/a/span/span[2]/span[2]"));
			Thread.sleep(2000);
			
			System.out.println(eachprice.getText());
			
			if(Integer.parseInt(eachprice.getText()) <=50) {
				Thread.sleep(2000);
			eachprice.click();
			}
			
			
		}
		
		
		
	}
		
		
	}

