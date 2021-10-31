package utilitypackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basepackage.TestBase;

public class Utilityclass extends TestBase {
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		com.google.common.io.Files.copy(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}	
	public static void selectoption(By locator, String option)
	{
	List<WebElement> TimZone =driver.findElements(locator);
	 
	 for(int i = 0;i<=TimZone.size()-1;i++) {
	 if(TimZone.get(i).getText().contains(option))
	 { 
		 TimZone.get(i).click();
		 break;
		 }
	 }
	}
	
	
    }



