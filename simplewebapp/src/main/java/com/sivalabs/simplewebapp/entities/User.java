/**
 * 
 */
package com.sivalabs.simplewebapp.entities;

import java.util.Date;

/**
 * @author Siva
 *
 */
public class User 
{
	private Integer userId;
	private String userName;
	private String password;
	private String fullName;
	private String email;
	private Date dob;
	private String phone;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getFullName()
	{
		return fullName;
	}
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
}
