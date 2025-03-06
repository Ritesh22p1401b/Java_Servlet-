package com.ritesh.demo_hib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="student_details")
public class Student_details {
	
	
	@Id
	private int roll_no;
	private String name;
	private String address;
	private String phone_number;
	
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String string) {
		this.phone_number = string;
	}
	@Override
	public String toString() {
		return "Student_details [roll_no=" + roll_no + ", name=" + name + ", address=" + address + ", phone_number="
				+ phone_number + "]";
	}
	
	

}
