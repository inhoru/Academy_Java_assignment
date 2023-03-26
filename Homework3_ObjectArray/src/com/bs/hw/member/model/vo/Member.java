package com.bs.hw.member.model.vo;

public class Member {
	private String id;
	private String naem;
	private String password;
	private String email;
	private char gender;
	private int age;
	
	public Member() {}

	public Member(String id, String naem, String password, String email, char gender, int age) {
		this.id = id;
		this.naem = naem;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String inform() {
		return this.id+" "+this.naem+" "+this.password+" "+this.email+" "+this.gender+" "+this.age;
		
	}
	
}
