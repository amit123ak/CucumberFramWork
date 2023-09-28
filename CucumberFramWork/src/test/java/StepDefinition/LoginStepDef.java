package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObject.AddCustomer;
import PageObject.LoginPageObj;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	public WebDriver driver;
	public LoginPageObj loginpage;
	public AddCustomer addcustomer;
	
	
@After("@login")	
public void teardown()
{
	System.out.println("closed driver");
	driver.close();
}

@BeforeStep
public void beforeStep()
{
System.out.println("this is before step hook");	
}


@AfterStep
public void afterstep()
{
System.out.println("this is After step hook");	
}
@Given("user browe url as {string}")
public void user_browe_url_as(String url) {
	WebDriverManager.chromedriver().clearResolutionCache().setup();
	  
	  ChromeOptions option=new ChromeOptions();
	  
	  
	  option.addArguments("--remote-allow-origins=*");
	  driver =new ChromeDriver(option);
	  loginpage=new LoginPageObj(driver);
	  addcustomer=new AddCustomer(driver);
	 
	  driver.get(url);
	  driver.manage().window().maximize();
  
}

@When("user enter the username as {string} and password as {string}")
public void user_enter_the_username_as_and_password_as(String username, String pwd) {
	
	loginpage.enterEmailAddress(username);
	loginpage.enterPasswordAddress(pwd);

}

@And("user click on the login in")
public void user_click_on_the_login_in() {
	
	loginpage.ClickLoginBtn();
  
	
}

@Then("page Title shoud be {string}")
public void page_title_shoud_be(String expected) {
	
String str=	driver.getTitle();

Assert.assertEquals(expected, str);


}

@When("click on the logout button")
public void click_on_the_logout_button() {
  loginpage.ClickLogOutBtn();
}

@Then("page Title should be {string}")
public void page_title_should_be(String expected) {
 String title= driver.getTitle();

  System.out.println(title);
  Assert.assertEquals(expected, title);
}

@And("closed brower")
public void closed_brower() {
  driver.close();
}



//================================================

@When("click on customer")
public void click_on_customer() {
	
	
	addcustomer.customerTab();
}

@When("click on add customer")
public void click_on_add_customer() {
	
	addcustomer.customerPage();
    
}

@Then("cutomers page should be displayed")
public void cutomers_page_should_be_displayed() {
	
	String actual=addcustomer.getcustomerPageTitle();
	Assert.assertEquals(actual, "Customers");

}

@When("click on add new customer")
public void click_on_add_new_customer() {
	
	addcustomer.Addnewcustomer();
   
}

@Then("add a new customer page should be displayed")
public void add_a_new_customer_page_should_be_displayed() {
	
String actual=	addcustomer.verifynewcustomerPage();
Assert.assertEquals(actual, "Add a new customer back to customer list");
	

}

@When("fill the customer info")
public void fill_the_customer_info() {
	addcustomer.EmailField("amitgondcse@gmail.com");
	
	addcustomer.PasswordField("amit123@123");
	addcustomer.FirstNameField("Amit");
	addcustomer.LastNameField("Gond");
	addcustomer.MaleRadio();
	addcustomer.DateOfBirth("03/24/1986");
	addcustomer.CompanyName("XYZ");
	addcustomer.Istaxexempt();
	addcustomer.SelectNewsletter();
	addcustomer.ManageOfVendor();
	addcustomer.AdminComment("this is workflow has to be followed while ");
    
}

@When("save customer info")
public void save_customer_info() {
	addcustomer.save();
	
   
}

@Then("customer info save message should be displayed")
public void customer_info_save_message_should_be_displayed() {
	
	String actualmessage= addcustomer.getsavemessage();
	
	Assert.assertEquals(actualmessage, "The new customer has been added successfully.");
  
}














}
