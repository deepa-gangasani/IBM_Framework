package com.training.bean;
/**
 * 
 * @author Deepa
 * @see this class shall get the bean data 
 */

public class RegistrationBean {
	private String firstName,lastName,email,phone,login,Password;
	public RegistrationBean() {
	}
	public RegistrationBean(String firstName,String lastName, String email, String phone, String login, String Password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone=phone;
		this.login = login;
		this.Password = Password;
	
	}
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	public String getphone() {
		return phone;
	}

	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getlogin() {
		return login;
	}

	public void setlogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	
		
}
