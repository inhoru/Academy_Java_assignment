package com.bs.example.practice8.model.vo;

public class Drive extends People{
	private String Area;
	private int career;
	public Drive() {
	}
	public Drive(String name, int age, char gender,String area, int career) {
		super(name,age,gender);
		Area = area;
		this.career = career;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+Area+" "+career;
	
	}
	@Override
	public boolean equals(Object o) {
		Drive d = (Drive) o;
		if (getName().equals(d.getName()) && getAge() == d.getAge() &&getGender()==d.getGender()&&Area==d.Area&&career==d.career) {

			return true;
		}
		return false;

	}
	
}
