package com.StudentsLeadsDevelopment.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students_Leads")
public class StudentsEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id ;
	@Column(name = "first_name",nullable = false ,length = 45)
	private String firstName ;
	@Column(name="last_name",nullable =false,length = 45)
	private String lastName ;
	@Column(name = "email",nullable = false,length=128,unique = true)
	private String email ;
	@Column(name="phone",nullable = false,length = 128,unique = true)
	private long phone ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
