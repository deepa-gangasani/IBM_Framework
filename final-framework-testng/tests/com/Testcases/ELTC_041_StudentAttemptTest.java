package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.ELTC_041_StudentAttemptTestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class ELTC_041_StudentAttemptTest {
	private WebDriver driver;
	private String baseUrl;
	private ELTC_041_StudentAttemptTestPOM ELTC_041_StudentAttemptTestPOM;
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
		ELTC_041_StudentAttemptTestPOM = new ELTC_041_StudentAttemptTestPOM(driver); 
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
		
	  ELTC_041_StudentAttemptTestPOM.sendUserName("Deepastu3");
	  ELTC_041_StudentAttemptTestPOM.sendPassword("Eaglecomp@001");
	  ELTC_041_StudentAttemptTestPOM.clickLoginBtn(); 
	  ELTC_041_StudentAttemptTestPOM.clickMycourses();
	  ELTC_041_StudentAttemptTestPOM.clickCoursecatalog();
  }
	 
 @Test(enabled=false)	 
  public void subscribecrc()
  {
	 ELTC_041_StudentAttemptTestPOM.sendSearchcourse("Selenium");
	 ELTC_041_StudentAttemptTestPOM.clicksubmitcourse();
	 ELTC_041_StudentAttemptTestPOM.clicksubscribecorejava();
	String expected= "You have been registered to course";
		String actual = ELTC_041_StudentAttemptTestPOM.registeredtocoursemsg();
			System.out.println(actual);
			assertEquals(actual, expected);
	 
  }
  
  @Test(priority=2)
  
  public void testdetails()
  {
  
	  ELTC_041_StudentAttemptTestPOM.clickMycourses();
	  ELTC_041_StudentAttemptTestPOM.clicksubscribedcrc();
	  ELTC_041_StudentAttemptTestPOM.clicktesticon();
	  ELTC_041_StudentAttemptTestPOM.testdetails();
	  ELTC_041_StudentAttemptTestPOM.teststatus();
	  ELTC_041_StudentAttemptTestPOM.clicktestname();
  
  }
  
@Test(priority=3)
  
  public void starttest() throws InterruptedException
  {  
	ELTC_041_StudentAttemptTestPOM.clickstartTest();
	ELTC_041_StudentAttemptTestPOM.q1();
	ELTC_041_StudentAttemptTestPOM.clickanswer1();
	ELTC_041_StudentAttemptTestPOM.submit();
	ELTC_041_StudentAttemptTestPOM.clickanswer2();
	ELTC_041_StudentAttemptTestPOM.submit();
	ELTC_041_StudentAttemptTestPOM.clickanswer3();
	ELTC_041_StudentAttemptTestPOM.submit();
	  Thread.sleep(3000);
	  ELTC_041_StudentAttemptTestPOM.detailedresults();
	
		
  }	
	
  }



