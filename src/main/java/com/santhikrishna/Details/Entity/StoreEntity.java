package com.santhikrishna.Details.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StoreDetails")

public class StoreEntity {
	
	@Id
	@Column(name="Customer Id")
    private int cust_id;
	
	@Column(name="Customer Name")
    private String name;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="Mobile")
    private String mob;
	
	@Column(name="MailID")
    private String mail;
	
	@Column(name="Address")
    private String address;
	
	@Column(name="Store Points")
	private int points;

	
	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public StoreEntity(int cust_id, String name, String dob, String mob, String mail, String address, int points) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.dob = dob;
		this.mob = mob;
		this.mail = mail;
		this.address = address;
		this.points = points;
	}


	public StoreEntity() {
		
	}
	

}
