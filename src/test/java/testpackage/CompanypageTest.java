package testpackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.TestBase;
import pagespackage.Companypage;
import pagespackage.Homepage;
import pagespackage.Loginpage;

public class CompanypageTest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	Companypage companypage;
	
	public CompanypageTest()
	{
		super();//this keyword calls TestBase cons having properties 
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		loginpage=new Loginpage();
		homepage=new Homepage();
		companypage=new Companypage();
				
	}
	

	@Test(priority=1)
	public void ValidateCompanycreated() throws InterruptedException
	{	
		homepage=loginpage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
		Thread.sleep(3000);
		homepage.clickontab();		
		boolean companycreated=companypage.createnewcompany();
		Assert.assertEquals(companycreated, true);
		
		
	}

}
