package com.bs.practice.point.model.vo;

public class Circle extends Point{
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius , int x , int y) {
		super(x , y);
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	
}
