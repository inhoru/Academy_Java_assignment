package com.bs.hw.employee.model.vo;

import java.util.Objects;

public class Employee {
	private int empNo;
	private String naem;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;

	public Employee() {
	}

	public Employee(int empNo, String naem, char gender, String phone) {
		this.empNo = empNo;
		this.naem = naem;
		this.gender = gender;
		this.phone = phone;

	}

	public Employee(int empNo, String naem, char gender, String phone,String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.naem = naem;
		this.gender = gender;
		this.phone = phone;
		this.dept=dept;
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String printEmployee() {
		return this.empNo+ " "+this.naem+" "+this.gender+ " "+this.phone+" "+this.dept+" "+this.salary+" "+this.bonus;
	}

}
