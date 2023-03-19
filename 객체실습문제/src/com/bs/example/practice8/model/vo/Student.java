package com.bs.example.practice8.model.vo;

public class Student extends People {
	private String subject;
	private int group;

	public Student() {
	}

	public Student(String name, int age, char gender, String subject, int group) {
		super(name, age, gender);
		this.subject = subject;
		this.group = group;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String toString() {
		return getName() + " " + getAge() + " " + getGender() + " " + subject + " " + group;

	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		if (getName().equals(s.getName()) && getAge() == s.getAge() && getGender() == s.getGender() && group == s.group) {

			return true;
		}
		return false;
	}

}
