package pagespackage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitypackage.Utilityclass;

import basepackage.TestBase;

public class Companypage extends TestBase {
	
	//company information
	
	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement txtboxCompanyname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Domain Name']")
	WebElement txtboxDomainName;
	
	@FindBy(xpath = "(//span[contains(text(),'Industry Type')])[1]/following-sibling::div")
	WebElement drpdwnIndustryType;
	
	@FindBy(xpath = "(//span[contains(text(),'Industry Type')])[1]/following-sibling::div//ul/li//span")
	WebElement drpdwnIndustryTypelist;
	

	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	WebElement DateOfCorporation;
	
	@FindBy(xpath = "//td[@title='30/10/2021']")
	WebElement pickdate;
	
	@FindBy(xpath = "//button[normalize-space()='APPLY']")
	WebElement btnApply;
	
	@FindBy(xpath = "//input[@placeholder='Select Number of Employees']")
	WebElement drpdwnNumberOfEmployees;
	
	@FindBy(xpath = "(//span[contains(text(),'Time Zone')])[1]/following-sibling::div")
	WebElement drpdwnTimeZone;

	@FindBy(xpath = "//input[@placeholder='Enter Tax ID']")
	WebElement txtboxTaxID;
	
	@FindBy(xpath = "(//span[contains(text(),'Currency')])[1]/following-sibling::div")
	WebElement drpdwnCurrency;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Text Here']")
	WebElement txtboxAbout;
	
	//contact information
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement chkboxAlloPublicDomain;
	
	@FindBy(xpath = "//input[@placeholder='Enter Primary Email']")
	WebElement txtboxprimaryEmail;
	
	@FindBy(xpath = "//div[@name='select_domain']//input[@placeholder='Select Domain Name']")
	WebElement drpdwnPrimaryDomainName;
	
	@FindBy(xpath = "//input[@name='phone_number']")
	WebElement txtboxPrimaryphnum;
	
	//branch1
	
	@FindBy(xpath = "//input[@placeholder='Enter Branch Code']")
	WebElement txtboxBranchCode;
	
	@FindBy(xpath = "//input[@placeholder='Enter Branch Name']")
	WebElement txtboxBranchname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Department Name']")
	WebElement txtboxDeptname;
	
	//branch communication information
	
	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement txtBranchEmail;
	
	@FindBy(xpath = "//input[@name='phone_number0']")
	WebElement txtboxBranchPh;
	
	@FindBy(xpath = "//input[@placeholder='Enter Website']")
	WebElement txtboxBranchwebsite;
	
	//Branch Address

	@FindBy(xpath = "(//span[@class='radio-icon'])[1]")
	WebElement chkboxAddressType;
	
	@FindBy(xpath = "	//input[@placeholder='Enter Location']")
	WebElement drpdwnBranchLocation;
	
	//Admin Information
	
	@FindBy(xpath = "//input[@placeholder='Enter Admin Name']")
	WebElement txtboxAdminName;
	
	@FindBy(xpath = "//input[@placeholder='Enter Admin Email']	")
	WebElement txtboxAdminEmail;
	
	@FindBy(xpath = "//div[@name='select_admin_domain']//input[@placeholder='Select Domain Name']")
	WebElement txtboxAdminDomainname;
	
	@FindBy(xpath = "//input[@placeholder='Select Branch Name']")
	WebElement txtboxAdminBranchname;
	
	@FindBy(xpath = "//input[@placeholder='Select Department']")
	WebElement txtboxAdminDeptname;
	
	@FindBy(xpath = "//input[@placeholder='Enter Admin Password']")
	WebElement txtboxAdminpwd;
	
	@FindBy(xpath = "//button[normalize-space()='SAVE']")
	WebElement btnSave;
	

	@FindBy(xpath = "//div[contains(text(),'Successfully Created Your Company')]")
	WebElement txtSuccessmsg;
	
	
	
	
	
	
	public Companypage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean createnewcompany() throws InterruptedException
	{
		
		Random r = new Random();
		char chars = (char)(r.nextInt(26) + 'a');
		txtboxCompanyname.sendKeys("CompanyName"+chars);
		txtboxDomainName.sendKeys(chars+"DomainName.com");
		
		drpdwnIndustryType.click();
		Thread.sleep(1000);			
		List<WebElement> IndustryType =driver.findElements(By.xpath("(//span[contains(text(),'Industry Type')])[1]/following-sibling::div//ul/li//span"));
		 
		 for(int i = 0;i<=IndustryType.size()-1;i++) {
		 if(IndustryType.get(i).getText().contains("Accommodation and Food Services"))
		 { 
			 IndustryType.get(i).click();
			 break;
			 }
		 }
		 drpdwnIndustryType.sendKeys(Keys.DOWN);		 
		DateOfCorporation.click();
		pickdate.click();
		btnApply.click();
		drpdwnNumberOfEmployees.click();
		drpdwnNumberOfEmployees.sendKeys("1 - 4");
		drpdwnNumberOfEmployees.sendKeys(Keys.ENTER);
		drpdwnTimeZone.click();		
		List<WebElement> TimZone =driver.findElements(By.xpath("(//span[contains(text(),'Time Zone')])[1]/following-sibling::div//ul/li//span"));
		 
		 for(int i = 0;i<=TimZone.size()-1;i++) {
		 if(TimZone.get(i).getText().contains("(GMT-12:00) International Date Line West (Etc/GMT+12)"))
		 { 
			 TimZone.get(i).click();
			 break;
			 }
		 }
		
		txtboxTaxID.sendKeys("123");
		drpdwnCurrency.click();
		List<WebElement> Currency =driver.findElements(By.xpath("(//span[contains(text(),'Currency')])[1]/following-sibling::div//ul/li//span"));
		 
		 for(int i = 0;i<=Currency.size()-1;i++) {
		 if(Currency.get(i).getText().contains("JPY(¥)"))
		 { 
			 Currency.get(i).click();
			 break;
			 }
		 }
		
		txtboxAbout.sendKeys("About");
		chkboxAlloPublicDomain.click();
		txtboxprimaryEmail.sendKeys("PrimaryEmail");
		drpdwnPrimaryDomainName.click();	
		drpdwnPrimaryDomainName.sendKeys(Keys.ENTER);		
		txtboxPrimaryphnum.sendKeys("9449967376");
		txtboxBranchCode.sendKeys("987");
		txtboxBranchname.sendKeys("BranchName");
		txtboxDeptname.sendKeys("Deptname");
		txtBranchEmail.sendKeys("branch@gmail.com");
		txtboxBranchPh.sendKeys("9449960376");
		txtboxBranchwebsite.sendKeys("https://crm.digicollect.com/setup");
		chkboxAddressType.click();
		drpdwnBranchLocation.click();
		drpdwnBranchLocation.sendKeys("Satellite, Bus Station, Pilibhit Bypass Rd, Sindhu Nagar, Bareilly, Uttar Pradesh 243005, India");
		Thread.sleep(3000);
		drpdwnBranchLocation.sendKeys(Keys.DOWN);
		txtboxAdminName.sendKeys("AdminName");
		txtboxAdminEmail.sendKeys("AdminEmail");
		txtboxAdminDomainname.click();		
		txtboxAdminDomainname.sendKeys(Keys.ENTER);
		txtboxAdminBranchname.click();
		txtboxAdminBranchname.sendKeys("BranchName");		
		txtboxAdminBranchname.sendKeys(Keys.ENTER);
		txtboxAdminDeptname.click();		
		txtboxAdminDeptname.sendKeys("Deptname");	
		txtboxAdminDeptname.sendKeys(Keys.ENTER);
		txtboxAdminpwd.sendKeys("Adminpwd@123");
		btnSave.click();
		Thread.sleep(1000);
		boolean companycreatedmsg=txtSuccessmsg.isDisplayed();
		return(companycreatedmsg);
		
		
	}


}
