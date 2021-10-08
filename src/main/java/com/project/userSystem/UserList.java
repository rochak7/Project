package com.project.userSystem;



import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "userlist")

public class UserList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "user_id")
	private Integer userId;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "mobile")
	private String mobile;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public UserList() {
		super();
		
	}


	public UserList(Integer userId, String fname, String lname, Date dob, String city, String mobile) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.city = city;
		this.mobile = mobile;
	}
	
	

	


}
