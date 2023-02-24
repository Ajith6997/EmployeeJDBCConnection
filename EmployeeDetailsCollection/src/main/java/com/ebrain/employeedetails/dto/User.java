package com.ebrain.employeedetails.dto;

public class User {
	private String EmployeeId;
	private String EmployeeName;
	private String FatherName;
	private String MotherName;
	private String Dob;
	private String EmailId;
	private String City;
	private String PhoneNo;
	
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public User() {
		super();
	}
	public User(String employeeId, String employeeName, String fatherName, String motherName, String dob,
			String emailId, String city, String phoneNo) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		FatherName = fatherName;
		MotherName = motherName;
		Dob = dob;
		EmailId = emailId;
		City = city;
		PhoneNo = phoneNo;
	}
	
		
	
}
