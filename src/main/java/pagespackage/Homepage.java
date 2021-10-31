package pagespackage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basepackage.TestBase;
import utilitypackage.Utilityclass;

public class Homepage extends TestBase {
	
	@FindBy(xpath = "//span[normalize-space()='Companies']")
	WebElement tabcompanies;
	
	@FindBy(xpath = "//a[@href='/setup']")
	WebElement tabcreatenew;
	

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String VerifyHomePageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void clickontab()
	{
		tabcompanies.click();
		tabcreatenew.click();
	}

		

	/*
	 * public String verifyusername() {
	 * System.out.println(txtAccountusername.getText()); return
	 * txtAccountusername.getText();
	 * 
	 * }
	 */

	public void SearchAndFindProduct() throws InterruptedException, IOException
	{ 	/*
		System.out.println("searchproduct");
		TextboxSearch.sendKeys("apple" + Keys.ENTER);	
		BtnFilterCategoryCellPhones.click();
		Thread.sleep(1000);
		//Select select=new Select(DropdwnSortBy);
		//select.selectByVisibleText("Price: High to Low");
		//List<WebElement> allOptions = driver.findElements(By.xpath("//label[contains(text(),'Sort by:')]/parent::*/
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", DropdwnSortBy);
		//option.click();*/
		
		/*
		 * List<WebElement> allOptions =driver.findElements(By.
		 * xpath("//li/a[contains(text(),'Low to High')]"));
		 * 
		 * System.out.println(allOptions.size()); for(int i = 0;
		 * i<=allOptions.size()-1;i++) {
		 * if(allOptions.get(i).getText().contains("Price: High to Low")) {
		 * allOptions.get(i).click(); break;
		 * 
		 * } }
		 */	
		///*executor.executeScript("arguments[0].click();", ChkboxFilterBrandApple);
		//Thread.sleep(1000);
		//List<WebElement> CellPhonelist =driver.findElements(By.xpath("//*[contains(@class,'s-main-slot s-result-list s-search-results sg-row')]/div//span[contains(@data-component-type,'s-product-image')]/following-sibling::div/div/h2/a/span"));
		//for(int i=0;i<=CellPhonelist.size()-1;i++)
		//{
			
		/*	System.out.println(CellPhonelist.get(i).getText());
			//CellPhonelist.get(0).click();
			break;
		}
		btnAddToCart.click();
		
		Thread.sleep(1000);
		btnGoToCart.click();
		String productprice=TxtProductPrice.getText();
		System.out.println("ProductPrice"+productprice);		
		String subtotalprice=TxtSubTotalPrice.getText();
		System.out.println("SubTotalPrice"+subtotalprice);
		Utilityclass.takeScreenshotAtEndOfTest();	*/
		
		 
	}
}
