package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.testData;

public class T01_homepageValidation {

public static WebDriver driver;
	
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		//loading the browser 
		driver=browserEngine.browserConfig();
	}

	
	@Test
	
	public static void homepageValidation()
	
	{
		//loading application under test 
		driver.get(testData.homepageURL);
		
		
		//validation the home page 
		
		String homepageactualTitle=driver.getTitle();
		
		Assert.assertEquals(homepageactualTitle, testData.homepageexpectedTitle);
		
		
		
	}



@AfterMethod



public static void tearDown()

{
	driver.close();
}
	
	
}
