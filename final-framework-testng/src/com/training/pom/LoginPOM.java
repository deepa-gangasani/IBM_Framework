package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Homepage']")
	private WebElement homebtn;
	
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	private WebElement editprofile;
	
	
	
	@FindBy(xpath="//input[@id='profile_password0']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement newpassword;
	
	@FindBy(xpath="//input[@id='profile_password2']")
	private WebElement cnfrmpassword;
	
	@FindBy(xpath="//button[@id='profile_apply_change']")
	private WebElement savechangesbtn;
	
	@FindBy(xpath="//a[contains(text(),'I lost my password')]")
	private WebElement lostpassowrd;
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement entermailid;
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement Mycourses;
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog;
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement Searchcourse;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitcourse;
	
	
	@FindBy(xpath="//div[@class='row']//div[@class='row']//div[2]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribe;
	
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement subscribedmsg;
	
	@FindBy(xpath="//a[contains(text(),'Learn Selenium')]")
	private WebElement subscribedcrc;
	
	@FindBy(xpath="//img[@id='toolimage_1934']")
	private WebElement crcdescription;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement dropdown;
	
	
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logout;
	
	
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
	
		
	public String pswdreset()
	{
	 String alertmsg= alertnewprofile.getText();
	return alertmsg;
	
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	public void clichomebtn() {
		this.homebtn.click();
	}
		
		public void cliceditprofile() {
			this.editprofile.click(); 
		
	}
		
		public void sendpass(String pass) {
			this.pass.clear(); 
			this.pass.sendKeys(pass); 
		}
		
		public void sendnewpassword(String newpassword) {
			this.newpassword.clear(); 
			this.newpassword.sendKeys(newpassword); 
		}

		public void sendcnfrmpassword(String cnfrmpassword) {
			
			this.cnfrmpassword.clear(); 
			this.cnfrmpassword.sendKeys(cnfrmpassword); 
			
		}
		
		public void clicksavechangesbtn() {
			this.savechangesbtn.click(); 
		}
		
		public void clicklostpassowrd() {
			this.lostpassowrd.click(); 
		}
		
		public void sendentermailid(String entermailid) {
			this.entermailid.clear(); 
			this.entermailid.sendKeys(entermailid); 
		}

		public void clickMycourses() {
			this.Mycourses.click(); 
		}
		
		public void clickCoursecatalog() {
			this.Coursecatalog.click(); 
		}
		
		public void sendSearchcourse(String Searchcourse) {
			this.Searchcourse.clear(); 
			this.Searchcourse.sendKeys(Searchcourse); 
		}
		
		public void clicksubmitcourse() {
			this.submitcourse.click(); 
		}
		public void clicksubscribe() {
			this.subscribe.click(); 
		}
		
			
		public void clicksubscribedcrc() {
			this.subscribedcrc.click(); 
		}
		
		public void clickcrcdecription() {
			this.crcdescription.click(); 
		}
		
		public void clickdropdown()
		{
			this.dropdown.click();
		}
		
		public void clicklogout()
		{
			this.logout.click();
		}
		
		}
