package com.chainsys.model;

import java.sql.SQLException;

import com.chainsys.dao.UserDAO;

public class User1 implements  UserDAO {
	String firstname;
	String lastname;
	String pwd;
	String phonenumber;
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public User1(){
		
	}
	public User1(String firstname, String lastname, String pwd, String phonenumber, String username, String password) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.pwd = pwd;
		this.phonenumber = phonenumber;
		this.username = username;
		this.password = password;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void Register(User1 u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void login(User1 u) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
