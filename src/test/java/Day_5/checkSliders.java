package Day_5;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkSliders {
	
	WebDriver driver;
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "http://practice.automationtesting.in/");
		
		driver.manage().window().maximize();
		
		
	}
	@Test
	public void test () {
		
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();
		
		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();
		
	//List<WebElement> slider = driver.findElement(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]/div"));
	
		 List<WebElement> sliders = driver.findElements(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]/div"));
		
		 
		 int size = sliders.size();
		 
		 if(size==3) {
			 
			 System.out.println("slider is 3");
		 }else {
			 
			 System.out.println("test failed !");
		 }
	
	}

}
