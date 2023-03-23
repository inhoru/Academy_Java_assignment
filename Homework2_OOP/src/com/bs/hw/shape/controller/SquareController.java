package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();

	public double calcPerimeter(double height, double Width) {
		s.setHeight(height);
		s.setWidth(Width);
		return (Width * 2) + (height * 2);

	}

	public double calArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return width * height;

	}

	public void paintColor(String color) {
		s.setColor(color);

	}

	public String print() {
		return "사각형 " + s.information();

	}
}
