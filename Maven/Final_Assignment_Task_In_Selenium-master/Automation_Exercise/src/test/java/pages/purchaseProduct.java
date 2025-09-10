package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class purchaseProduct {
	WebDriver driver;
	
	//Product
	By product = By.xpath("//a[text()=' Products']");
	By searchproduct = By.id("search_product");
	By search = By.id("submit_search");
	By viewproduct = By.xpath("//a[text()='View Product']");
	By AddQuantity = By.id("quantity");
	By viewproductAddcart = By.xpath("//button[@type='button']");
	By continuebuttonProduct = By.xpath("//button[@data-dismiss='modal']");
	By addtocart1 = By.xpath("//a[@data-product-id='2']");
	By addtocart2 = By.xpath("//a[@data-product-id='16']");
	By choosebrand = By.xpath("//a[text()='Polo']");
	By addtocartbrand = By.xpath("//a[@data-product-id='33']");
	
	//Cart
	By cart = By.xpath("//a[text()=' Cart']");
	By checkout = By.xpath("//a[@class='btn btn-default check_out']");
	By placeorder = By.xpath("//a[text()='Place Order']");
	
	//payment
	By nameonCard = By.xpath("//input[@data-qa='name-on-card']");
	By cardNumber = By.xpath("//input[@data-qa='card-number']");
	By cvc = By.xpath("//input[@data-qa='cvc']");
	By expmonth = By.xpath("//input[@data-qa='expiry-month']");
	By expyear = By.xpath("//input[@data-qa='expiry-year']");
	By paybutton = By.xpath("//button[@data-qa='pay-button']");
	By downloadInvoice = By.xpath("//a[text()='Download Invoice']");
	By continuebutton = By.xpath("//a[text()='Continue']");
	 
	public purchaseProduct(WebDriver driver) {
	      this.driver = driver;
	  }
	
  @Test
  //productbutton
  public void clickproduct() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(product).click();
  }
  
  //searchproduct
  public void enterproductname(String Nameproduct) throws Exception{
	   Thread.sleep(1000);
	   WebElement productName = driver.findElement(searchproduct);
	   productName.sendKeys(Nameproduct);
	   System.out.println("searchproduct: " + productName.getAttribute("value"));
  }
  
  //searchButton
  public void searchproduct() throws Exception{
	    Thread.sleep(1000);
	    driver.findElement(search).click();
  }
  
  //viewproduct
  public void productview() throws Exception{
	    Thread.sleep(2000);
	    driver.findElement(viewproduct).click();
  }
  
  //AddQuantity
  public void Addproductlevel(String productlevel) throws Exception{
	   Thread.sleep(1000);
	   WebElement addproductlevel = driver.findElement(AddQuantity);
	   addproductlevel.clear();
	   addproductlevel.sendKeys(productlevel);
	   System.out.println("Add Product Quantity: " + addproductlevel.getAttribute("value"));
  }
  
  //viewproductAddcart
  public void addcartInProduct() throws Exception{
	    Thread.sleep(1000);
	    driver.findElement(viewproductAddcart).click();
  }
  
  //viewproductAddcart
  public void continuebutton() throws Exception{
	    Thread.sleep(1000);
	    driver.findElement(continuebuttonProduct).click();
  }
  
  //addtocart1
  public void addproduct1() throws Exception{
	    Thread.sleep(2000);
	    driver.findElement(addtocart1).click();
  }
  
  //addtocart1
  public void addproduct2() throws Exception{
	    Thread.sleep(2000);
	    driver.findElement(addtocart2).click();
  }
  
  //choosebrand
  public void brand() throws Exception{
	    Thread.sleep(2000);
	    driver.findElement(choosebrand).click();
  }
  
  //addtocartbrand
  public void addproduct33() throws Exception{
	    Thread.sleep(2000);
	    driver.findElement(addtocartbrand).click();
  }
  
  //cart
  public void clickcart() throws Exception{
	  Thread.sleep(2000);
	  driver.findElement(cart).click();
  }
  //checkout
  public void checkoutButton() throws Exception{
	  Thread.sleep(2000);
	  driver.findElement(checkout).click();
  }
  
  //placeorder
  public void placeorderButton() throws Exception{
	  Thread.sleep(2000);
	  driver.findElement(placeorder).click();
  }

//Payment
  //NameonCard
  public void entercardName(String cardownername) throws Exception{
	  Thread.sleep(1000);
	   WebElement cardName = driver.findElement(nameonCard);
	   cardName.sendKeys(cardownername);
	   System.out.println("Name on card: " + cardName.getAttribute("value"));
  }
  
  //cardNumber
  public void entercardNumber(String number) throws Exception{
	  Thread.sleep(1000);
	   WebElement cardnumber = driver.findElement(cardNumber);
	   cardnumber.sendKeys(number);
	   System.out.println("Card Number: " + cardnumber.getAttribute("value"));
  }
  
  //cvc
  public void entercardcvc(String cardcvc) throws Exception{
	  Thread.sleep(1000);
	   WebElement cardcvcnumber = driver.findElement(cvc);
	   cardcvcnumber.sendKeys(cardcvc);
	   System.out.println("CVC Number: " + cardcvcnumber.getAttribute("value"));
  }
  
  //expmonth
  public void enterexpmonth(String cardmonth) throws Exception{
	  Thread.sleep(1000);
	   WebElement entercardmonth = driver.findElement(expmonth);
	   entercardmonth.sendKeys(cardmonth);
	   System.out.println("Exp Month: " + entercardmonth.getAttribute("value"));
  }
  
  //expyear
  public void enterexpyear(String cardyear) throws Exception{
	  Thread.sleep(1000);
	   WebElement entercardyear = driver.findElement(expyear);
	   entercardyear.sendKeys(cardyear);
	   System.out.println("Exp Year: " + entercardyear.getAttribute("value"));
  }
  
  //paybutton
  public void enterpayButton() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(paybutton).click();
  }
  
  //downloadInvoice
  public void download() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(downloadInvoice).click();
  }
  
  //continuebutton
  public void clickcontinue() throws Exception{
	  Thread.sleep(1000);
	  driver.findElement(continuebutton).click();
  }
}