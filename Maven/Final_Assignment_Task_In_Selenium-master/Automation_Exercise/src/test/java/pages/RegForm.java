package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegForm {
	
	WebDriver driver;
	
	// Locators for New User
    By signupName = By.xpath("//input[@data-qa='signup-name']");
    By signupEmailAddress = By.xpath("//input[@data-qa='signup-email']");
    By signupButton = By.xpath("//button[@data-qa='signup-button']");
    
    //Locators for Account Information
    By titlemr = By.id("id_gender1");
    By titlemrs = By.id("id_gender2");
    By password=By.id("password");
    
    By fillday = By.id("days");
    By fillmonth = By.id("months");
    By fillyear = By.id("years");
    
    By firstname = By.id("first_name");
    By lastName = By.id("last_name");
    
    By companyName = By.id("company");
    By AddressName = By.id("address1");
    By countryDropdown = By.id("country");
    
    By state = By.id("state");
    By city = By.id("city");
    By postalCode = By.id("zipcode");
    By MobileNumber = By.id("mobile_number");
    
    By CreateAccount = By.xpath("//button[@data-qa='create-account']");
    By afterSubmit = By.xpath("//a[@data-qa='continue-button']");

	By logout = By.xpath("//a[text()=' Logout']");
	
	//Login user Locator
	By loginEmail = By.xpath("//input[@data-qa='login-email']");
	By loginPassword = By.xpath("//input[@data-qa='login-password']");
	By login = By.xpath("//button[@data-qa='login-button']");
    
    
	public RegForm(WebDriver driver) {
        this.driver = driver;
        System.out.println("✓ Registration Form page object initialized");
    }
	
  @Test
  //SignUp Name 
  public void enterName(String NameValue) throws Exception{
	  Thread.sleep(1000);
	   WebElement Name = driver.findElement(signupName);
	   Name.sendKeys(NameValue);
	   System.out.println("Name: " + Name.getAttribute("value"));
  }
  
  //SignUp EmailAddress
  public void enterEmailAddress(String EmailValue) throws Exception{
	  Thread.sleep(1000);
	   WebElement Email = driver.findElement(signupEmailAddress);
	   Email.sendKeys(EmailValue);
	   System.out.println("SignUpEmailAddress: " + Email.getAttribute("value"));
  }
  
  //signUpsubmit
  public void clicksignup() {
	driver.findElement(signupButton).click();
  }
  
  //Title
  public void clickTitle(String Title) throws Exception{
	  Thread.sleep(1000);
	  if(Title.equals("Mr")) {
		  WebElement mr = driver.findElement(titlemr);
		  mr.click();
		  System.out.println("Title: " + mr.getAttribute("value"));
	  }else if(Title.equals("Mrs")){
		  WebElement mrs = driver.findElement(titlemrs);
		  mrs.click();
		  System.out.println("Title: " + mrs.getAttribute("value"));
	  }
    }
  
  //Password
  public void enterpassword(String PasswordValue) throws Exception{
	   Thread.sleep(1000);
	   WebElement Password = driver.findElement(password);
	   Password.sendKeys(PasswordValue);
	   System.out.println("Password: " + Password.getAttribute("value"));
  }
  
  //Day
  public void chooseday(String day) throws Exception{
	  Thread.sleep(1000);
	  WebElement d = driver.findElement(fillday);
	  Select dropdown1 = new Select(d);
	  dropdown1.selectByVisibleText(day);
	  System.out.println("Day: "+ d.getAttribute("value"));
  }
  
  //Month
  public void choosemonth(String month) throws Exception{
	  Thread.sleep(1000);
	  WebElement m = driver.findElement(fillmonth);
	  Select dropdown2 = new Select(m);
	  dropdown2.selectByVisibleText(month);
	  System.out.println("Month: "+ m.getAttribute("value"));
  }
  
  //year
  public void chooseyear(String year) throws Exception{
	  Thread.sleep(1000);
	  WebElement y = driver.findElement(fillyear);
	  Select dropdown3 = new Select(y);
	  dropdown3.selectByVisibleText(year);
	  System.out.println("Year: "+ y.getAttribute("value"));
  }
  
  //First Name 
  public void enterFirstName(String firstNameValue) throws Exception{
	   Thread.sleep(1000); 
	   WebElement FirstName = driver.findElement(firstname);
	   FirstName.sendKeys(firstNameValue);
	   System.out.println("First Name: " + FirstName.getAttribute("value"));
 }
 
  // Last Name
  public void enterLastName(String lastNameValue) throws Exception {
	  Thread.sleep(1000);
	  WebElement LastName = driver.findElement(lastName);
	  LastName.sendKeys(lastNameValue);
	  System.out.println("Last Name: " + LastName.getAttribute("value"));
  }
  
  //company
  public void enterCompanyName(String companyValue) throws Exception {
	  Thread.sleep(1000);
	  WebElement company = driver.findElement(companyName);
	  company.sendKeys(companyValue);
	  System.out.println("CompanyName: " + company.getAttribute("value"));
  }
  
  //Address
  public void enterAddress(String addressValue) throws Exception {
	  Thread.sleep(1000);
	  WebElement address = driver.findElement(AddressName);
	  address.sendKeys(addressValue);
	  System.out.println("Address: " + address.getAttribute("value"));
  }
  
  //Country
  public void entercountry(String country) throws Exception{
	  Thread.sleep(1000);
	  WebElement c = driver.findElement(countryDropdown);
	  Select dropdown = new Select(c);
	  dropdown.selectByVisibleText(country);
	  System.out.println("Country: "+ c.getAttribute("value"));
  }
  
  //State
  public void enterState(String stateName) throws Exception{
	  Thread.sleep(1000);
	  WebElement StateName = driver.findElement(state);
	  StateName.sendKeys(stateName);
	  System.out.println("State Name: " + StateName.getAttribute("value"));
  }
  
  //City
  public void enterCity(String cityName) throws Exception{
	  Thread.sleep(1000);
	  WebElement CityName = driver.findElement(city);
	  CityName.sendKeys(cityName);
	  System.out.println("City Name: " + CityName.getAttribute("value"));
  }
  
  //ZipCode
  public void enterPostalCode(String zipCode) throws Exception{
	  Thread.sleep(1000);
	  WebElement pincode = driver.findElement(postalCode);
	  pincode.sendKeys(zipCode);
	  System.out.println("Pin Code: " + pincode.getAttribute("value"));
  }
  
  //Mobile Number
  public void enterMobileNumber(String mobile) throws Exception{
	  Thread.sleep(1000);
	  WebElement phone = driver.findElement(MobileNumber);
	  phone.sendKeys(mobile);
	  System.out.println("Mobile Number: " + phone.getAttribute("value"));
  }
  
  //CreateAccount
  public void sumbit() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(CreateAccount).click();
	  System.out.println("Account Created");
  }  
  
  //ContinueButton
  public void continueButton() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(afterSubmit).click();
  }


  //LogOut
  public void clickLogout() throws Exception{
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(logout).click();
  }
  
  //Login User MailAddress
  public void loginEmail(String email) throws Exception{
	  Thread.sleep(1000);
	  WebElement usermail = driver.findElement(loginEmail);
	  usermail.sendKeys(email);
	  System.out.println("Login Email: "+ usermail.getAttribute("value"));
  }
  
  //Login User Password
  public void loginPassword(String password) throws Exception{
	  Thread.sleep(1000);
	  WebElement userpassword = driver.findElement(loginPassword);
	  userpassword.sendKeys(password);
	  System.out.println("Login Password: "+ userpassword.getAttribute("value"));
  }
  
  //Login User Button
  public void loginButton() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(login).click();
  }
  
  //Login Details Condition
  public boolean ifuserAlreadyRegistered() throws Exception{
	  Thread.sleep(1000);
	  boolean b;
	  try {
		  WebElement isPresent = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
		  return isPresent.isDisplayed();
	  }catch(Exception e) {
		  b= false;
	  }
	  return b;
  }
  
  
}
