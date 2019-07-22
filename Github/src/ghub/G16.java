package ghub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G16 {
	WebDriver driver;

	@Test
  public void f() {
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		System.out.println("Done");
		System.out.println("ok");
  }
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\158\\chromedriver.exe");
      driver=new ChromeDriver();
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
