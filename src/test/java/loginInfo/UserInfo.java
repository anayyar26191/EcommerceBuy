package loginInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInfo {
	WebDriver driver;
	By UNM = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By PWD = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By LGN = By.className("_2AkmmA _1LctnI _7UHT_c");

//create constructor method
public UserInfo(WebDriver driver)
{
	this.driver=driver;
}

public void username_type(String uname)
{
driver.findElement(UNM).sendKeys(uname);
			
}

public void password_type(String psword)
{
driver.findElement(PWD).sendKeys(psword);

}

public void login_type()
{
driver.findElement(LGN).click();

}
}
