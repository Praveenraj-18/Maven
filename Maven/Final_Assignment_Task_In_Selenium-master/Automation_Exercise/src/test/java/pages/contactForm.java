package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class contactForm {
	WebDriver driver;
	
	//ContactUs Locator
		By contact = By.xpath("//a[text()=' Contact us']");
		
		By contactusName = By.xpath("//input[@data-qa='name']");
	    By contactusEmail = By.xpath("//input[@data-qa='email']");
	    By contactussubject = By.xpath("//input[@data-qa='subject']");
	    By contactusmessage = By.xpath("//textarea[@data-qa='message']");
	    By fileupload = By.xpath("//input[@name='upload_file']");
	    By sumbitButton=By.xpath("//input[@type='submit']");
	    
	    By contacttohome = By.xpath("//a[@class='btn btn-success']");
	
	public contactForm(WebDriver driver) {
	      this.driver = driver;
	  }
	
  @Test
  
//ContactUs
  public void clickcontact() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(contact).click();
  }
  
  //contactusName
  public void usname(String name) throws Exception{
	  Thread.sleep(1000);
	  WebElement queryname = driver.findElement(contactusName);
	  queryname.sendKeys(name);
	  System.out.println("Contact Name: "+ queryname.getAttribute("value"));
  }
  
  //contactusEmail
  public void usemail(String mail) throws Exception{
	  Thread.sleep(1000);
	  WebElement querymail = driver.findElement(contactusEmail);
	  querymail.sendKeys(mail);
	  System.out.println("Contact Email: "+ querymail.getAttribute("value"));
  }
  
  //contactussubject
  public void usesubject(String subject) throws Exception{
	  Thread.sleep(1000);
	  WebElement querysubject = driver.findElement(contactussubject);
	  querysubject.sendKeys(subject);
	  System.out.println("Contact subject: "+ querysubject.getAttribute("value"));
  }
  
  //contactusmessage
  public void usemessage(String message) throws Exception{
	  Thread.sleep(1000);
	  WebElement querymessage = driver.findElement(contactusmessage);
	  querymessage.sendKeys(message);
	  System.out.println("Contact Message: "+ querymessage.getAttribute("value"));
  }
  
  //Fileupload
  public void choosefile() throws Exception{
	  Thread.sleep(1000);
	  WebElement fileInput = driver.findElement(fileupload);
	  fileInput.sendKeys("C:\\Users\\santhosh.v\\Desktop\\Training_Project\\Automation_Exercise\\src\\test\\resources\\Data.properties");
  }
  
  //submitbutton
  public void contactsumbit() {
	driver.findElement(sumbitButton).click(); 
  }
  
  //contacttohome
  public void contacthome() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(contacttohome).click();
  }
  
}
