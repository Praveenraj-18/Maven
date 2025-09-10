package pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class LoginOrangeHRM {
	 WebDriver driver = null;
	 By Un = By.name("username");
	 By pwd = By.name("password");
	 By submit = By.xpath("//button[@type='submit']");
	 public void enterUN(String input)
	 {
		 driver.findElement(Un).sendKeys(input);
	 }
	 public void enterPW(String input)
	 {
		 driver.findElement(pwd).sendKeys(input);
	 }
	 public void loginClick()
	 {
		 driver.findElement(submit).click();
	 }
	 public LoginOrangeHRM(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	
 
}