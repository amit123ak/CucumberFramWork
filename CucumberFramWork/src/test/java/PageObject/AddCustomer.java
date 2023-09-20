package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomer {

public	WebDriver ldriver;
	public AddCustomer(WebDriver driver)
	{
		this.ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement customerTab;
	
	public void customerTab()
	{
		customerTab.click();
	}
	
	//cutomer page 
	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement customerPage;
	
	public void customerPage()
	{
		customerPage.click();
	}
	
	//Add New Customer 
	//cutomer page 
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement Addnewcustomer;
	
	public void Addnewcustomer()
	{
		Addnewcustomer.click();
	}
	
	
	//Email Field  
	@FindBy(id="Email")
	WebElement EmailField;
	
	public void EmailField(String email)
	{
		EmailField.sendKeys(email);;
	}
	
	//password field
	@FindBy(xpath="//input[@id='Password']")
	WebElement PasswordField;
	
	public void PasswordField(String pwd)
	{
		PasswordField.sendKeys(pwd);;
	}
	
	
	//firstname field
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstNameField;
	
	public void FirstNameField(String firstname)
	{
		FirstNameField.sendKeys(firstname);;
	}
	
	
	
	
	//lastname field
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastNameField;
	
	public void LastNameField(String lastname)
	{
		LastNameField.sendKeys(lastname);
	}
	
	
	//male radio
		@FindBy(xpath="//input[@id='Gender_Male']")
		WebElement MaleRadio;
		
		public void MaleRadio()
		{
			MaleRadio.click();
		}
	
		
		
		//Dob field
				@FindBy(xpath="//input[@id='DateOfBirth']")
				WebElement DateOfBirth;
				
				public void DateOfBirth(String dob)
				{
					DateOfBirth.sendKeys(dob);
				}
				
				
				@FindBy(id="Company")
				WebElement CompanyName;
				
				public void CompanyName(String componyname)
				{
					CompanyName.sendKeys(componyname);
				}
					
				
				@FindBy(xpath="//input[@id='IsTaxExempt']")
				WebElement Istaxexempt;
				
				public void Istaxexempt()
				{
					Istaxexempt.click();;
				}
					
				
				
				
				@FindBy(css=".k-input.k-readonly")
				WebElement inputclick;
				public void inputclick()

				{
					inputclick.click();;
				}
					
				
				@FindBy(xpath="//li[contains(text(),'Your store name')]")
				WebElement Newsletter;

				
				public void SelectNewsletter()

				{
					Istaxexempt.click();;
				}
					
				
				
				
				@FindBy(id="VendorId")
				WebElement drop;

				
				public void ManageOfVendor()

				{
					Select sc =new Select(drop);

					List<WebElement>options=sc.getOptions();

					for(WebElement option1:options)
					{
					      	if(option1.getText().equalsIgnoreCase("Vendor 2"))
					      	{
					      		option1.click();
					      		break; 
					      	}
				}
				}
				
				
				@FindBy(xpath="//textarea[@id='AdminComment']")
				WebElement AdminComment;

				
				public void AdminComment(String text)

				{
					AdminComment.sendKeys(text);;
				}
				
				
				@FindBy(xpath="//button[@name='save']")
				WebElement save;

				
				public void save()

				{
					save.click();
				}
				
				
				@FindBy(xpath="//h1[@class='float-left']")
				WebElement newcustomerPage;
				public String verifynewcustomerPage()

				{
					return newcustomerPage.getText();
				}
					
				
					
				@FindBy(xpath="//h1[@class='float-left']")
				WebElement customerPageTitle;
				public String getcustomerPageTitle()

				{
					return customerPageTitle.getText();
				}
					
				
				
				@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
				WebElement savemessage;
				public String getsavemessage()

				{
					return savemessage.getText();
				}
	
	
	
	
	
}
