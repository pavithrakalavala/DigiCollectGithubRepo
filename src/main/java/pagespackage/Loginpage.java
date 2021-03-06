package pagespackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.TestBase;

public class Loginpage extends TestBase {
	
	//Page Factory-Object Repository:
	
	@FindBy(name="userid")
	WebElement txtboxEmail;	

	@FindBy(name="password")
	WebElement txtboxPassword;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement btnSigninSubmit;		
	
		
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public Homepage Login(String un,String pwd) throws InterruptedException
	{
		
		txtboxEmail.sendKeys(un);	
		txtboxPassword.sendKeys(pwd);
		btnSigninSubmit.click();		
		return new Homepage();
		
	}
	

}
