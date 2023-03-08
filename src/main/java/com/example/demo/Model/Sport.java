package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sport {
@Id
	private int id;
	private String name;
	private String dob;
	private String contact;
	private String sport;
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sport(int id, String name, String dob, String contact, String sport) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.contact = contact;
		this.sport = sport;
	}
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	
}
