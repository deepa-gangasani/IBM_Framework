package com.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.RegistrationDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegistrationPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
/* Author : Deepa
 * TC ID  : ELTC_072
 * TC Description :To verify whether application allows admin to add multiple new user as a different role by entering valid credentials in mandatory fields only
 * Pre-condition : 1. User should have launched the application
 * 				   2.User should have logged in as admin and present in Home page
 */
public class ELTC_072_AllowsAdmintoaddMultiplenewusers {
	private static WebDriver driver;
	private static JavascriptExecutor jse ;
	private static String baseUrl;
	private static Properties properties;
	private static ScreenShot screenShot;
	private LoginPOM loginPOM;
	private RegistrationPOM RegistrationPOM;
	private RegistrationPOM registrationPOM;
//	private ElearningHomePOM elearningHomePOM;
	//private AdministrationPOM administrationPOM;
	String Actual,Expected,Actual1,Expected1;
	
	@Test(priority=0)
	  public void BrowserLaunchTest() throws InterruptedException {
		    driver = DriverFactory.getDriver(DriverNames.CHROME);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 baseUrl = properties.getProperty("baseURL");
			loginPOM = new LoginPOM(driver);
			RegistrationPOM=new RegistrationPOM(driver);
			screenShot = new ScreenShot(driver); 
			jse =((JavascriptExecutor) driver);
			// open the browser 
			driver.get(baseUrl); 
			 loginPOM.sendUserName("admin");
			  loginPOM.sendPassword("admin@1234");
			  loginPOM.clickLoginBtn();
			  Thread.sleep(4000);
			  RegistrationPOM.clickadduser();
			}
	
	@Test(priority=1,dataProvider="Testdata_TC_72",dataProviderClass=RegistrationDataProviders.class)
	public void EnterUserCredntialsTogetRegistered( String firstname, String lastName, String email, String phone, String login, String Password) throws InterruptedException {
		
		 	
		  RegistrationPOM.sendfirstname(firstname);
		  RegistrationPOM.sendlastname(lastName);
		  RegistrationPOM.sendemail(email);
		  RegistrationPOM.sendphone(phone);
		  RegistrationPOM.sendlogin(login);
		  RegistrationPOM.clickEnterpswdradiobtn();
		  RegistrationPOM.sendpassword(Password);
		  RegistrationPOM.clickprofile();
		  RegistrationPOM.clickadduserbtn();
		
	}
  
	
  @BeforeClass
  public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
		 }

  @AfterClass
  public void tearDown() throws Exception {
		//Thread.sleep(3000);
		driver.quit();
	}

}
