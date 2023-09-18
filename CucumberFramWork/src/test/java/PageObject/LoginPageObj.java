package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObj {
	
	
	
	WebDriver ldriver;
	
	public LoginPageObj(WebDriver driver)
	{
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
    WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
     WebElement SubmitBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void enterEmailAddress(String Emails)
	{
		email.clear();
		email.sendKeys(Emails);
		

	
	}
	
	public void enterPasswordAddress(String Pwd)
	{
		password.clear();
		password.sendKeys(Pwd);
		

	}	
	public void ClickLoginBtn()
	{
	    SubmitBtn.click();
		

     }
	public void ClickLogOutBtn()
	{
       logout.click();
		

     }
	
	
}
