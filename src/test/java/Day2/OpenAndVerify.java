package Day2;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAndVerify {
	
	 WebDriver driver;
	
	@Before
	public void beforetest() {
		
		
		
		  // WebDriver driver;
			
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			driver.get("https:www.youtube.com");
			driver.manage().window().maximize();
			
	}
	@After
	public void aftertest() {
		
		
		driver.close();
		
		
	}
	@Ignore
	@Test
	public void verifyTitle() {
		
      String url = driver.getCurrentUrl();
	 String pagetitle =   driver.getTitle();
	 
	 String expectedUrl = "https:www.youtube.com";
	 String expectedPageTitle = "Youtube";
	 
	 if(expectedPageTitle.equalsIgnoreCase(url)) {
		 System.out.println("Pass");
		 
	 }else {
		 
		 System.out.println("Failed");
		 
		 System.out.println("Expected to see"+expectedPageTitle);
		 System.out.println("The driver get"+pagetitle);
	 }
	 

		 
		 
	 }
	@Ignore
	@Test
	public void verifyUrl() {
		
		
		String Url = driver.getCurrentUrl();
		String expectedUrl = "https://www.youtube.com/";
		if(expectedUrl.equalsIgnoreCase(Url)) {
			System.out.println("Url pass");
			
		}else {
			
			
			System.out.println("Failed");
			
			System.out.println("Expec to see "+ expectedUrl);
			System.out.println("The driver get "+Url);
			
			
		}
	}
		 
	@Test
	public void pageSource() {
		
		
		
		String sourece = driver.getPageSource();
		System.out.println(sourece);
		driver.navigate().to("https://www.techcircleschool.com");
		
		driver.navigate().back();
		
		
	}
		 
	 }
	
	
	





