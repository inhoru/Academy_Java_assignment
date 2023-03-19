package com.bs.example.practice8.model.vo;

public class Staff extends People{
	private String department;
	private String phoneNumber;
	
	public Staff() {}

	public Staff(String name, int age, char gender,String department, String phoneNumber) {
		super(name,age,gender);
		this.department = department;
		this.phoneNumber = phoneNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+department+" "+phoneNumber;
	
	}
	@Override
	public boolean equals(Object o) {
		Staff s = (Staff) o;
		if (getName().equals(s.getName()) && getAge() == s.getAge() &&department.equals(s.department)) {

			return true;
		}
		return false;

	}
}
