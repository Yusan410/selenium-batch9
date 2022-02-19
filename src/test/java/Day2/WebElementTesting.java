package Day2;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTesting {
	
	
	WebDriver driver;
	@Before
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
				
	}
	@Test
	public void inputemialAdress() {
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("enterimg")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Yusan");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Ali");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("26319 andre arbor , Houston Texas");
		
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Ali410@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8323492218");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
		
		String language1 = "Japanese";
		String language2 = "Thai";

		driver.findElement(By.id("msdd")).click();
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"Skills\"]")).sendKeys("Java");
		
		//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[9]/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("Japan");
		
		Select country = new Select(driver.findElement(By.id("country")));
		
		country.selectByValue("Japan");
		
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]")).sendKeys("1992");
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).sendKeys("April");
		
		driver.findElement(By.xpath("//*[@id=\"daybox\"]")).sendKeys("10");
		
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Ali4100");
		
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Ali4100");
		
		driver.findElement(By.id("submitbtn")).click();
		
		
	}

}
