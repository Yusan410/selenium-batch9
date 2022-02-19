package Day_4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imliciWaitExample {
	

	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void tesbeforetest() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get( "http://practice.automationtesting.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
    public void test1() {
        
        //login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        //initiating explicit wait object
        wait = new WebDriverWait(driver, 30);
        
        //waiting for the element to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
        
        //after visibility is true, then store the element text for verification
        String actualWelcomeText = driver.findElement(By.id("welcome")).getText();
        String expected = "Welcome Paul";
    
        
        
        
        if(actualWelcomeText.equalsIgnoreCase(expected)) {
            System.out.println("PASSED");
        }else {
            System.out.println("GO LEARN JAVA");
        }
        
        
       
        	
        	
        }
	    @Test
        public void fluenWaitTest() {
        	
        	Wait wait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS)
        			.pollingEvery(5, TimeUnit.SECONDS)
        			.ignoring(Exception.class);
        	
        	wait.until(ExpectedConditions.alertIsPresent());
        	
        	
        	
        	
    }

    }
	
    
		
		
		
		
		
	

