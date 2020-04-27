package com.bestbright.model;

public class Student {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String name;
	private String rollNo;
	private String phoneNo;
	private String address;
	
	public Student() {
		
	}
	public Student(int id, String name, String rollNo, String phoneNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	

}
