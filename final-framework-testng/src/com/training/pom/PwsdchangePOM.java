package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PwsdchangePOM {
	private WebDriver driver; 
	
	public PwsdchangePOM(WebDriver driver) {
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
		
		
		
		}
