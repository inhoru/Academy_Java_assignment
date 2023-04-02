package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] Arr = new int[2];
		Arr[0]=0;
		Arr[1]=0;
		for(int i = 0;i<s.length;i++) {
			if(s==null) {
				Arr[0]++;
			}
			
		}
		for(int i = 0;i<e.length;i++) {
			if(e==null) {
				Arr[1]++;
			}
		}
		return Arr;
		
		
	}
	public void insertStudent(String name,int age, double height, double weight, int grade, String major) {
		
	}
	public Student[] printStudent(){
		
	}
	public void insertEmployee(String naem, int age, double height, double weight, int salary, String dept) {
		
	}
	public Employee[] printEmployee() {
		
	}
	
	
}
