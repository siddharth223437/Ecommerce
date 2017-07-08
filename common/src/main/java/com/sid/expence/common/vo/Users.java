package com.sid.expence.common.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String city;
	private String address;
	private String state;
	private String country;
	private int zipcode;
	private int phoneNo;
	private String ssn;
	private Date dob;
	private Date profileCreated;
	private Date profileDeleted;
	private boolean remeberme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getProfileCreated() {
		return profileCreated;
	}
	public void setProfileCreated(Date profileCreated) {
		this.profileCreated = profileCreated;
	}
	public Date getProfileDeleted() {
		return profileDeleted;
	}
	public void setProfileDeleted(Date profileDeleted) {
		this.profileDeleted = profileDeleted;
	}
	public boolean isRemeberme() {
		return remeberme;
	}
	public void setRemeberme(boolean remeberme) {
		this.remeberme = remeberme;
	}
	
	
	

}
