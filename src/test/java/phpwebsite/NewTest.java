package phpwebsite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://18.223.117.41:32768");
		
		
	  }
	
	
	
  @Test
  public void verify () {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.navigate().to(" http://18.223.117.41:32768/content/about-us.php");
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }
  
 
}
