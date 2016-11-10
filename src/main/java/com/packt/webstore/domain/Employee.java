package com.packt.webstore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
 	private int id;
	
   @Column(name= "firstName")
	private String firstName;
   
   @Column(name="lastName")
	private String lastName;
 
   @Column(name="age")
	private int age;
   
   @Column(name="title")
	private String title;
   
   @Column(name="employeeNumber")
	private int employeeNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adddressid")
	private Address address;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
 	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
 	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
 
}
