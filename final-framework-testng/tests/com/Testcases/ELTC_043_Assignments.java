package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.ELTC_043_AssignmentsPOM;
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

public class ELTC_043_Assignments {
	private WebDriver driver;
	private String baseUrl;
	private ELTC_043_AssignmentsPOM ELTC_043_AssignmentsPOM;
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
		ELTC_043_AssignmentsPOM = new ELTC_043_AssignmentsPOM(driver); 
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
		
	  ELTC_043_AssignmentsPOM.sendUserName("Deepastu3");
	  ELTC_043_AssignmentsPOM.sendPassword("Eaglecomp@001");
	  ELTC_043_AssignmentsPOM.clickLoginBtn(); 
	  ELTC_043_AssignmentsPOM.clickMycourses();
	  ELTC_043_AssignmentsPOM.clickCoursecatalog();
  }
	 
 @Test(enabled=false)	 
  public void subscribecrc()
  {
	 ELTC_043_AssignmentsPOM.sendSearchcourse("Selenium");
	 ELTC_043_AssignmentsPOM.clicksubmitcourse();
	 ELTC_043_AssignmentsPOM.clicksubscribecorejava();
	/*String expected= "You have been registered to course";
		String actual = ELTC_043_AssignmentsPOM.registeredtocoursemsg();
			System.out.println(actual);
			assertEquals(actual, expected);*/
	 
  }
  
  @Test(priority=2)
  
  public void assignmentdetails() throws InterruptedException
  {
  
	  ELTC_043_AssignmentsPOM.clickMycourses();
	  ELTC_043_AssignmentsPOM.clicksubscribedcrc();
	  ELTC_043_AssignmentsPOM.clickAssignments();
	  ELTC_043_AssignmentsPOM.Assignmentdetails();
	  ELTC_043_AssignmentsPOM.clickassignmentcourse();
	  ELTC_043_AssignmentsPOM.assignmentdescription();
	  ELTC_043_AssignmentsPOM.clickUploadMyAssignment();
	  // ELTC_043_AssignmentsPOM.FileUpload();
	  ELTC_043_AssignmentsPOM.clicksimpleUpload();
	  ELTC_043_AssignmentsPOM.sendFiletitle("month data");
	  ELTC_043_AssignmentsPOM.clickupload();
	  ELTC_043_AssignmentsPOM.clickfinalupload();
	  ELTC_043_AssignmentsPOM.uploadsuccessmsg();
	  ELTC_043_AssignmentsPOM.assignmentnames();
	  
  
  }
  	
  }



