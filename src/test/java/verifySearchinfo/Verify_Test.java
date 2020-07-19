package verifySearchinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Test {
  @Test
  public void flipKArtLogin() {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com/");
 
	  
}
}