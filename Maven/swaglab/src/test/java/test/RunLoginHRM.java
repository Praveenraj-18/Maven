package test;
 
import java.io.FileReader;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import pages.LoginOrangeHRM;
public class RunLoginHRM {
	static WebDriver driver = null;
	public static void orangeHRM() throws Exception {
		driver = new ChromeDriver();
		LoginOrangeHRM l = new LoginOrangeHRM(driver);
		Thread.sleep(2000);
		
		FileReader fr = new FileReader("C:\\Users\\Praveenraj.t\\Maven\\swaglab\\src\\test\\java\\test\\test.properties");
		  Properties p = new Properties();
		  p.load(fr);

		  driver.get(p.getProperty("url"));
		  Thread.sleep(4000);

		  l.enterUN(p.getProperty("Un"));
		  l.enterPW(p.getProperty("pwd"));
		  l.loginClick();
 
		  
	}
 
	public static void main(String[] args) throws Exception{
		orangeHRM();
	}
 
}