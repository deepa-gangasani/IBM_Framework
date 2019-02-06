package com.Testcases;

import org.testng.annotations.Test;

import com.training.pom.ELTC_044_StudentToDiscussintheForumPOM;
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

public class ELTC_044_StudentToDiscussintheForum {
	private WebDriver driver;
	private String baseUrl;
	private ELTC_044_StudentToDiscussintheForumPOM ELTC_044_StudentToDiscussintheForumPOM;
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
		ELTC_044_StudentToDiscussintheForumPOM = new ELTC_044_StudentToDiscussintheForumPOM(driver); 
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
		
	  ELTC_044_StudentToDiscussintheForumPOM.sendUserName("Deepastu3");
	  ELTC_044_StudentToDiscussintheForumPOM.sendPassword("Eaglecomp@001");
	  ELTC_044_StudentToDiscussintheForumPOM.clickLoginBtn(); 
	  ELTC_044_StudentToDiscussintheForumPOM.clickMycourses();
	  ELTC_044_StudentToDiscussintheForumPOM.clickCoursecatalog();
  }
	 
 @Test(enabled=false)	 
  public void subscribecrc()
  {
	 ELTC_044_StudentToDiscussintheForumPOM.sendSearchcourse("Selenium");
	 ELTC_044_StudentToDiscussintheForumPOM.clicksubmitcourse();
	 ELTC_044_StudentToDiscussintheForumPOM.clicksubscribecorejava();
	String expected= "You have been registered to course:Selenium_Basics";
		String actual = ELTC_044_StudentToDiscussintheForumPOM.coursesubscitionmsg();
			System.out.println(actual);
			assertEquals(actual, expected);
	 
  }
  
  @Test(priority=2)
  
  public void creatingThread() throws InterruptedException
  {
  
	  ELTC_044_StudentToDiscussintheForumPOM.clickMycourses();
	  ELTC_044_StudentToDiscussintheForumPOM.clicksubscribedcrc();
	  ELTC_044_StudentToDiscussintheForumPOM.clickForum();
	  ELTC_044_StudentToDiscussintheForumPOM.clickGroup();
	  ELTC_044_StudentToDiscussintheForumPOM.clickCreateThread();
	  ELTC_044_StudentToDiscussintheForumPOM.ThreadTitle("1st Forum");
	  Thread.sleep(4000);
	  ELTC_044_StudentToDiscussintheForumPOM.richtextbox("This is my frst comment");
	  
	  ELTC_044_StudentToDiscussintheForumPOM.clickSubmitPost();
	  String expected= "The new thread has been added\n"+ 
	  		"You can now return to the Forum\n"+ 
	  		"You can now return to the Message";
		String actual = ELTC_044_StudentToDiscussintheForumPOM.threadaddedmsg();
			System.out.println(actual);
			assertEquals(actual, expected);
  }
  
   @Test(priority=3)

   public void replyToThread() throws InterruptedException
	 {
	  
	  ELTC_044_StudentToDiscussintheForumPOM.clickReplytomessage();
	  Thread.sleep(3000);
	  ELTC_044_StudentToDiscussintheForumPOM.grouprichtext("this is the reply for 1st comment");
	  
	  ELTC_044_StudentToDiscussintheForumPOM.clickreplytomessage2();
	  String expected1= "The reply has been added";
	  String actual1 = ELTC_044_StudentToDiscussintheForumPOM.Replymessage();
	  System.out.println(actual1);
	  assertEquals(actual1, expected1);
	 }
	  

	
		
  }	
	
  



