package Day_3;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {
	
WebDriver driver;
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "http://practice.automationtesting.in/");
	}
	
	@Test
	public void test1() throws InterruptedException {
		
driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();
		
		driver.findElement(By.xpath("//div[@id='content']/nav//a")).click();
		
		driver.findElement(By.xpath("//div[@id='text-22-sub_row_1-0-2-2-0']//a")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();
	      
	    driver.findElement(By.xpath("//*[@class=\"description_tab active\"]/a")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[3]/ul/li[2]")).click();
	   
	      
	    driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();
	      
		driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/div/input")).sendKeys("7928",Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]//a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"coupon_code\"]")).sendKeys("krishnasakinala");
		
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]//a")).click();
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[2]/p[2]//a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a[2]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]/a")).click();

		
		
		
		
		
	}
	@Ignore
	@Test
	public void test2() {

		List<WebElement> sliders = driver.findElements(By.xpath("//*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]//div//div//div"));
		
	
		int size = sliders.size();
		
		
		if(size ==3) {
			
			
			System.out.println("sliders are 3");
		}else {
			
			
			System.out.println("Test faild");
		}
		
		
		
	}
	
}
