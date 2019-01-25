package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordResetPOM {
	private WebDriver driver; 
	
	public PasswordResetPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'I lost my password')]")
	private WebElement Lostmypassword;
	
	//input[@id='lost_password_user']
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement Enterusermailid;
	
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
	
		
	public String pswdreset()
	{
	 String alertmsg= alertnewprofile.getText();
	return alertmsg;
	
	}
	
		
	public void clickLoginBtn() {
		this.Lostmypassword.click(); 
	}
	
	@FindBy(xpath="//input[@id='lost_password_user']")
	private WebElement Enterusermailid;

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
