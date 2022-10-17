package com.sbi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PERSONALDETAILS")
public class Details {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long userid;
	
	@Column(name = "FIRSTNAME")
	private String fname;
	
	@Column(name = "LASTNAME")
	private String Lname;
	
	@Column(name = "ADDRESS")
	private String Address;
	
	@Column(name = "EMAILDID")
	private String Emailid;
	
	@Column(name = "GOVTID",unique=true)
	private String Govtid;
	
	@Column(name = "PHONENO",unique=true)
	private long phoneno;
	
	@Column(name = "DATEOFBIRTH")
	private String Dob;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getGovtid() {
		return Govtid;
	}
	public void setGovtid(String govtid) {
		Govtid = govtid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public Details(long userid, String fname, String lname, String address, String emailid, String govtid, long phoneno,
			String dob) {
		super();
		this.userid = userid;
		this.fname = fname;
		Lname = lname;
		Address = address;
		Emailid = emailid;
		Govtid = govtid;
		this.phoneno = phoneno;
		Dob = dob;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

