package com.bs.practice.snack.controller;

import com.bs.practice.snack.model.vo.Snack;


public class SnackController {
	private Snack sa= new Snack();

	public SnackController() {
	}
	
	public String saveData(String kind, String name, String flavor, int numOf,int price) {
		
		sa.setKind(kind);
		sa.setName(name);
		sa.setFlavor(flavor);
		sa.setNumOf(numOf);
		sa.setPrice(price);;
		return "";
		
	}
	public String confirmData() {
		return sa.information();
				
	}
	
}
