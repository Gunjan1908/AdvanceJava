package com.app.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empId;
	private String empName,empPwd,empEmail,empPhno;
	
	//generate getters and setters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPhno() {
		return empPhno;
	}
	public void setEmpPhno(String empPhno) {
		this.empPhno = empPhno;
	}

}
