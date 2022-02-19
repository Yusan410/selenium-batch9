package Review;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	WebDriver driver;

	@Before
	public void beforemethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/checkboxradio/");

	}

	@Test
	public void test() throws InterruptedException {

		driver.switchTo().frame(0);

		List<WebElement> element = driver.findElements(By.xpath("/html/body/div/fieldset"));

		Thread.sleep(2000);

		for (WebElement el1 : element) {

			String eachelment = el1.getText();

			System.out.println(eachelment);

			if (eachelment.contains("Location")) {

				List<WebElement> loc = driver.findElements(By.xpath("/html/body/div/fieldset[1]/label"));
				Thread.sleep(2000);

				for (WebElement locc : loc) {

					if (locc.getText().contains("London")) {
						Thread.sleep(2000);

						locc.click();
					}

				}

			}

			if (eachelment.contains("Hotel")) {

				List<WebElement> hotel = driver.findElements(By.xpath("/html/body/div/fieldset[2]/label"));

				Thread.sleep(2000);

				for (WebElement hotel1 : hotel) {

					if (hotel1.getText().contains("2 Star")) {

						Thread.sleep(2000);

						hotel1.click();
					}

					if (hotel1.getText().contains("5 Star")) {

						hotel1.click();

					}

				}

			}
			if (eachelment.contains("Bed Type")) {

				List<WebElement> bed = driver.findElements(By.xpath("/html/body/div/fieldset[3]/label"));

				Thread.sleep(2000);

				for (WebElement bed1 : bed) {

					if (bed1.getText().contains("2 Double")) {

						bed1.click();
						Thread.sleep(2000);
					}
					if (bed1.getText().contains("1 King")) {
						Thread.sleep(2000);

						bed1.click();
					}

				}

			}

		}

	}

	@After
	public void testt() {

		driver.close();
	}
}
