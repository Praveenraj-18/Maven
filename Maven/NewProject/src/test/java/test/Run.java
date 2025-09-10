package test;

import java.io.FileReader;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
import pages.Login;
public class Run {
	static WebDriver driver = null;
 
	public static void signup() throws Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		Login S = new Login(driver);
		Thread.sleep(2000);
		
		FileReader fr = new FileReader("C:\\Users\\Praveenraj.t\\Maven\\NewProject\\src\\test\\java\\test\\Test.properties");
		  Properties p = new Properties();
		  p.load(fr);
//		  WebDriver wd = new ChromeDriver();
		  driver.get(p.getProperty("url"));
//		  Thread.sleep(4000);
		  driver.manage().window().maximize();
		  
		  String Firstwebsite= driver.getWindowHandle();
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get(p.getProperty("url1"));
		  Thread.sleep(2000);
		  driver.switchTo().window(Firstwebsite);
		  
		  
		  Thread.sleep(1000);
		  S.enterFN(p.getProperty("fn"));
		  Thread.sleep(3000);
		  S.enterLN(p.getProperty("ln"));
		  Thread.sleep(1000);
		  S.enterEmail(p.getProperty("email"));
		  Thread.sleep(1000);
		  S.enterPH(p.getProperty("phno"));
		  Thread.sleep(1000);
		  S.enterComName(p.getProperty("company"));
		  Thread.sleep(2000);
		  S.enterCountry(p.getProperty("country"));
		  Thread.sleep(2000);
		  S.enterAccessTrail(p.getProperty("users"));
		  Thread.sleep(1000);
		  S.enterRadio();
		  Thread.sleep(1000);
		  S.enterCheckBox1();
		  Thread.sleep(1000);
		  S.enterCheckBox2();
		  Thread.sleep(1000);
		  S.submitButton();
	}
		  public static void main(String[] args) throws Exception{
				// TODO Auto-generated method stub
			  signup();
 
	}
 
}