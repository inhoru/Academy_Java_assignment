package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x ,int y, int radius) {
		// PI 값 메소드
		double PI = Math.PI;
		return "면적 : "+ x+", " + y+", " + radius+" / "+PI*radius*radius;
	}
	public String calcCircum(int x, int y, int radius) {
		
		// PI 값 메소드
		double PI = Math.PI;
		return "둘레 : "+ x+", " + y+", " + radius+" / "+PI*2;
	}
}
