package com.bs.practice.point.controller;

import com.bs.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		return "면적 : "+ x+", " + y+", " +height+", "+width+" / "+ height*width;
		
		
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		return "둘레 : "+ x+", " + y+", " +height+", "+width+" / "+ 2*(height+width);
		
	}
	
}
