package com.bs.hw.employee.controller;

import com.bs.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add (int empNo, String name,char gender, String phone) {
		e.setEmpNo(empNo);
		e.setNaem(name);
		e.setGender(gender);
		e.setPhone(phone);
		
	}
	public void add (int empNo, String name, char gender, String phone, String dapt, int salary, double bonus) {
		e.setEmpNo(empNo);
		e.setNaem(name);
		e.setGender(gender);
		e.setPhone(phone);
		e.setDept(dapt);
		e.setSalary(salary);
		e.setBonus(bonus);
		
		}
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
		
	}
	public Employee remove() {
		
	return e=null;
		
	}
	public String inform() {
		if(e==null) {
			return null;
		}else {
			
		return e.printEmployee();
		
		}
	}

}
