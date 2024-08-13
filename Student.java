package edu.students.model;

public class Student {

	//fields / properties of 'Students' table from database
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String pass;
	private int id;
	//below are getters and setters to set and get values
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student(int id, String fname, String lname, String email, String mobile, String pass){
		super();
		this.setId(id); 
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.pass = pass;}
	public Student() {
		super();
	}
	
	
}

