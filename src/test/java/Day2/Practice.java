package Day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	
	/*
	 * Go to Amazon.com
	 * send "any key"
	 * click search
	 * select one of the item
	 * add it to cart
	 * validate the item in the cart
	 * remove the item
	 * validate the cart is empty
	 * navigate to Youtube
	 * validate the title is youtube
	 * search video
	 * play the video
	 * */
	//instantiation
	WebDriver driver;
	@Before
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		
		
		
		
	}
	@Test
	public void test1() throws InterruptedException {
		
//		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone xr phone case");
//		
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']//img")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//		
//		driver.findElement(By.xpath("//*[@id='nav-tools']//a[4]")).click();
//		
//		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		driver.navigate().to("http://www.youtube.com");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("C.Ronaldo");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	
		Thread.sleep(2000);
	
		
		
		
		
	}
	@After
	public void testcase() {
		
		
		driver.close();
		
		System.out.println("Test compelete!!!");
		
		
		
	}

}
