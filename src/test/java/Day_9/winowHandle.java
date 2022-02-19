package Day_9;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class winowHandle {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void tesbeforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://phptravels.com/demo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test1() throws InterruptedException {

		String Email = "user@phptravels.com";

		String Password = "demouser";

		driver.findElement(By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a"))
				.click();

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);

		// try login in to front end agent application
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input"))
				.sendKeys(Email);

		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"))
				.sendKeys(Password);

		driver.findElement(By.xpath("//*[@id=\"cookie_stop\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"gateway_bank-transfer\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button"))
				.click();

		String result = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/small/strong")).getText();

		String result1 = "Bank Transfer USD 50.00";

		if (result.equalsIgnoreCase(result1)) {

			System.out.println(result);

			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div/div[2]/div[2]")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/a")).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
		}

	}

}
