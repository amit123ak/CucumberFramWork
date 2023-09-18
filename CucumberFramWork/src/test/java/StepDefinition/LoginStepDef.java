package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import PageObject.LoginPageObj;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {

	public WebDriver driver;
	public LoginPageObj loginpage;

@Given("user browe url as {string}")
public void user_browe_url_as(String url) {
	WebDriverManager.chromedriver().setup();
	  
	  ChromeOptions option=new ChromeOptions();
	  
	  
	  option.addArguments("--remote-allow-origins=*");
	  driver =new ChromeDriver(option);
	  loginpage=new LoginPageObj(driver);
	 
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


}
