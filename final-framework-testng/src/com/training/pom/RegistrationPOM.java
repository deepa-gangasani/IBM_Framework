package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPOM {
private WebDriver driver; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement Adduser;
	
	public void clickadduser()
	{
		this.Adduser.click();
	}
	
	@FindBy(id="firstname")
	private WebElement firstname; 
	
	public void sendfirstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
		}
	
	@FindBy(id="lastname")
	private WebElement lastname;
	
	public void sendlastname(String lastname) {
		this.firstname.clear();
		this.firstname.sendKeys(lastname);
		}
	
	@FindBy(id="email")
	private WebElement email;
	
	public void sendemail(String email) {
		this.firstname.clear();
		this.firstname.sendKeys(email);
		}
	
	@FindBy(id="phone")
	private WebElement phone;
	
	public void sendphone(String phone) {
		this.firstname.clear();
		this.firstname.sendKeys(phone);
		}
	
	@FindBy(id="username")
	private WebElement login;
	
	public void sendlogin(String login)
	{
		this.login.clear();
		this.login.sendKeys(login);
	}
	
	@FindBy(id="qf_89c86c")
	private WebElement Enterpswdradiobtn;
	
	public void clickEnterpswdradiobtn()
	{
		this.Enterpswdradiobtn.click();
	}
	
	@FindBy(id="password")
	private WebElement Password;
	
	public void sendpassword(String Password)
	{
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
			
	@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'Trainer')]")
	private WebElement profile;
	
	public void clickprofile()
	{
		this.profile.click();
	}
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement adduserbtn;
	
	public void clickadduserbtn()
	{
		this.adduserbtn.click();
	}
	
}
