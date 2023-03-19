package com.bs.example.practice8.model.vo;

public class Teacher extends People {
	private String major;
	private String mySubject;
	public Teacher() {}
	public Teacher(String name, int age, char gender,String major, String mySubject) {
		super(name,age,gender);
		this.major = major;
		this.mySubject = mySubject;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMySubject() {
		return mySubject;
	}
	public void setMySubject(String mySubject) {
		this.mySubject = mySubject;
	}
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+major+" "+mySubject;
	
	}
	@Override
	public boolean equals(Object o) {
		Teacher t = (Teacher) o;
		if (getName().equals(t.getName()) && getAge() == t.getAge() && getMajor().equals(t.major)) {

			return true;
		}
		return false;
	}

}
