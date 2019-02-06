package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPOM {
	private WebDriver driver; 
	
	public LogoutPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement dropdown;
	
	
	@FindBy(xpath="//a[@id='logout_button']")
	private WebElement logout;
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement alertnewprofile;
		
		
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

		
		public void clickdropdown()
		{
			this.dropdown.click();
		}
		
		public void clicklogout()
		{
			this.logout.click();
		}
		
		public String pswdreset()
		{
		 String alertmsg= alertnewprofile.getText();
		return alertmsg;
		
		}
		
		}
