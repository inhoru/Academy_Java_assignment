package com.bs.hw.shape.controller;

import com.bs.hw.shape.model.vo.Shape;
import com.bs.hw.shape.view.ShapeMenu;

public class TriangleController {
	private Shape s = new Shape();

	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return (height * width) / 2;
	}

	public void paintColor(String color) {
		s.setColor(color);
		;
	}

	public String print() {

		return "삼각형 " + s.information();
	}
}
