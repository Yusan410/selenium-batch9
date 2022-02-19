package Day_3;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	
	WebDriver driver;
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "http://the-internet.herokuapp.com/");
		
		//driver.manage().window().maximize();
		
	
	}
	@Test
	public void test() {
		
		// this code we will learn next week
      //  driver.switchTo().frame("demo-frame");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		
		WebElement box1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		
		WebElement box2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
		Boolean firsebox = box1.isSelected();
		
		Boolean checkbox2 = box2.isSelected();
		
		if(firsebox) {
			
			System.out.println("first check box already selected");
			
		}else{
			
			box1.click();
		}
		
		if(checkbox2) {
			
			System.out.println("check box already selected");
			
		}else {
			
			
		box2.click();
			
			
			
			
			
		}
	
	}
	
	

}
