package practice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {
	
WebDriver driver;
	
	@Before
	public void beforemetho() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		
	}
	@Test
	public void test1() {
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 12",Keys.ENTER);
		
		List<WebElement> colum = driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]//div"));
		
		
	for(int i = 16; i <colum.size();i++) {
		
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div["+i+"]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]"));
		
		
		System.out.println(price.getText());
		
if(Integer.parseInt(price.getText())>=800) {
			
			
			price.click();
			
		
		
		}
		
		
	}
		
		
		
	}
}
