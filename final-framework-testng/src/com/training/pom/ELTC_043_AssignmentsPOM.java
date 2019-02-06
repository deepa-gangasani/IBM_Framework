package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELTC_043_AssignmentsPOM {
	
private WebDriver driver; 
	
	public ELTC_043_AssignmentsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Login
	@FindBy(id="login")
	private WebElement userName; 
	
	public void sendUserName(String userName) {
		System.out.println("Enter Username");
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	public void sendPassword(String password) {
		System.out.println("password");
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn;
	
	public void clickLoginBtn() {
		System.out.println("clicking login button");
		this.loginBtn.click(); 
	}
		
			
	//Search for course
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement Mycourses;
	
	public void clickMycourses() {
		System.out.println("Click on my course");
		this.Mycourses.click(); 
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecatalog;
	
	public void clickCoursecatalog() {
		System.out.println("course catalog page");
		this.Coursecatalog.click(); 
	}
	
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement Searchcourse;
	
	public void sendSearchcourse(String Searchcourse) {
		System.out.println("Searching for course");
		this.Searchcourse.clear(); 
		this.Searchcourse.sendKeys(Searchcourse); 
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitcourse;
	
	public void clicksubmitcourse() {
		System.out.println("clicking on search");
		this.submitcourse.click(); 
	}
	
	
	@FindBy(xpath="//div[@class='row']//div[5]//div[1]//div[2]//div[4]//div[2]//div[1]//a[1]")
	private WebElement subscribecorejava;
	
	public void clicksubscribecorejava() {
		System.out.println("subscribing course");
		this.subscribecorejava.click(); 
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'Selenium_Basics')]")
	private WebElement subscribedcrc;
	
	public void clicksubscribedcrc() {
		System.out.println("Clicking on subscribed course");
		this.subscribedcrc.click(); 
	}
	
	@FindBy(xpath="//img[@id='toolimage_640']")
	private WebElement Assignments;
	
	public void clickAssignments()
	{
		this.Assignments.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Selenium_basics')]")
	private WebElement Assignmentdetails;
	
	public String Assignmentdetails()
	{
		String details=this.Assignmentdetails.getText();
		System.out.println("Assignmenet details::"+details);
		return details;
	
	}
	
	public void clickassignmentcourse()
	{
		this.Assignmentdetails.click();
		
	}
	
		
	@FindBy(xpath="//a[@class='btn-toolbar']")
	private WebElement UploadMyAssignment;
	
	public void clickUploadMyAssignment()
	{
		this.UploadMyAssignment.click();
	}
	
	
	@FindBy(id="tabs2")
	private WebElement SimpleUpload;
	
	public void clicksimpleUpload()
	{
		this.SimpleUpload.click();
	}
	
	@FindBy(id="file_upload")
	
	private WebElement Filetitle;
	
	public void sendFiletitle(String Filetitle) {
		
		this.Filetitle.sendKeys(Filetitle);
		
	}
	
	@FindBy(id="form-work_file")
	private WebElement upload;
	
	public void clickupload()
	{
		
		this.upload.sendKeys("C:\\month.txt");
		//upload.click();
	
	}
	
	@FindBy(id="form-work_submitWork")
	private WebElement finalupload;
	
	public void clickfinalupload()
	{
		this.finalupload.click();
	}
	
	
	
	@FindBy(xpath="//div[@class='alert alert-info']")
	private WebElement uploadsuccessmsg;
	
	public String uploadsuccessmsg()
	{
		String msg=this.uploadsuccessmsg.getText();
		System.out.println("File Upload success message::-"+uploadsuccessmsg);
		return msg;
	}
	
	
	@FindBy(xpath="//p[contains(text(),'this assignment is for selenium basics')]")
	private WebElement assignmnetdescription;
	
	public String assignmentdescription()
	{
		String assdescription = this.assignmnetdescription.getText();
		System.out.println("Description of the assignment is:: "+assignmnetdescription);
		return assdescription; 
	}
	
	@FindBy(xpath="//body[contains(@class,'section-mycourses')]/div[@class='wrap']/section[@id='content-section']/div[@class='container']/div[@class='row']/div[@class='col-xs-12 col-md-12']/section[@id='main_content']/div[3]/div[1]")
	private WebElement assignmentnames;
	
	public String assignmentnames()
	
	{
		String assnames= this.assignmentnames.getText();
		System.out.println("Assignment names are below::"+assignmentnames);
		return assnames;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
	