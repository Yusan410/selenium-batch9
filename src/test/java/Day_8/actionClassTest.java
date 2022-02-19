package Day_8;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionClassTest {
	

WebDriver driver;
WebDriverWait wait;


@Before
public void tesbeforetest() {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get( "https://www.amazon.com");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

}    
     @Ignore
     @Test
     public void test () {
    	 
    	// Action a =  new Actions(driver);
	
	Actions a = new Actions(driver);
	
	WebElement accountbutton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
	
	
	
	
	
	a.moveToElement(accountbutton).build().perform();
	
	
	
	
	
	
}
     @Ignore
     @Test
     public void test1() {
    	 
    	 
    	 driver.navigate().to("http://automationpractice.com/index.php");
    	 
    	 
         driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();

         Actions action = new Actions(driver);
         
         WebElement selectItem = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
         action.moveToElement(selectItem).build().perform();
         
         driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span")).click();

     }
     
     @Test
     public void test2() {
    	 
    	 
    	 driver.navigate().to("https://jqueryui.com/droppable/");
    	 
    	 
    	// driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
    	 
    	 Actions aa = new Actions(driver);
    	 
    	 driver.switchTo().frame(0);
    	 
    	 WebElement drr = driver.findElement(By.id("draggable"));  
    	 
    	 WebElement dr1 = driver.findElement(By.id("droppable"));
    	 
    	 aa.dragAndDrop(drr, dr1).build().perform();
    	
  	 
     }
  

 
        








    	 
    	 
     }
    	 
 
    	 
 
