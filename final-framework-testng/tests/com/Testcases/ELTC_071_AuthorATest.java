package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.ELTC_041_StudentAttemptTestPOM;
import com.training.pom.ELTC_042_TakeAssessmentPOM;
import com.training.pom.ELTC_071_AuthorATestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class ELTC_071_AuthorATest {
	private WebDriver driver;
	private String baseUrl;
	private ELTC_042_TakeAssessmentPOM ELTC_042_TakeAssessmentPOM;
	private ELTC_071_AuthorATestPOM ELTC_071_AuthorATestPOM;
	private static Properties properties;
	
	@BeforeClass
	  public static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }
	
    
		//screenShot.captureScreenShot("First");
	 @Test(priority=0)
  public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		ELTC_042_TakeAssessmentPOM = new ELTC_042_TakeAssessmentPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
  }

  @AfterClass
  public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
  }
  @Test(priority=1)
  public void coursecatalog() {
		
	  ELTC_042_TakeAssessmentPOM.sendUserName("Deepastu3");
	  ELTC_042_TakeAssessmentPOM.sendPassword("Eaglecomp@001");
	  ELTC_042_TakeAssessmentPOM.clickLoginBtn(); 
	  ELTC_071_AuthorATestPOM.clicktesticon();
	  ELTC_071_AuthorATestPOM.clickcreatetest();
	  
  }
	 
 @Test(enabled=false)	 
  public void subscribecrc()
  {
	 ELTC_042_TakeAssessmentPOM.sendSearchcourse("Selenium");
	 ELTC_042_TakeAssessmentPOM.clicksubmitcourse();
	 ELTC_042_TakeAssessmentPOM.clicksubscribecorejava();
	String expected= "You have been registered to course";
		String actual = ELTC_042_TakeAssessmentPOM.registeredtocoursemsg();
			System.out.println(actual);
			assertEquals(actual, expected);
	 
  }
  
  @Test(priority=2)
  
  public void testdetails()
  {
	  ELTC_042_TakeAssessmentPOM.clickMycourses();
	  ELTC_042_TakeAssessmentPOM.clicksubscribedcrc();
	  ELTC_042_TakeAssessmentPOM.clickassessement();
	  ELTC_042_TakeAssessmentPOM.clicktestname();
	//  ELTC_042_TakeAssessmentPOM.testdetails();
	//  ELTC_042_TakeAssessmentPOM.teststatus();
	  
  }
  
@Test(priority=3)
  
  public void starttest()
  {  
	ELTC_042_TakeAssessmentPOM.clickstartTest();
	ELTC_042_TakeAssessmentPOM.q1();
	ELTC_042_TakeAssessmentPOM.clickanswer1();
	ELTC_042_TakeAssessmentPOM.submit();
	ELTC_042_TakeAssessmentPOM.clickanswer2();
	ELTC_042_TakeAssessmentPOM.submit();
	ELTC_042_TakeAssessmentPOM.clickanswer3();
	ELTC_042_TakeAssessmentPOM.submit();
	 
	ELTC_042_TakeAssessmentPOM.detailedresults();
		
  }	
	
  }



