package com.bs.practice.list.view;

import java.util.Scanner;

import com.bs.practice.list.music.controller.MusicController;
import com.bs.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
		
	public void mainMenu() {
		while (true) {
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 수정");
		System.out.println("7. 곡 명 오름차순 정렬");
		System.out.println("8. 가수 명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int num = sc.nextInt();
		switch(num){
		case 1 :addList(); break;
			
		case 2 :addAtZero();break;
			
		case 3 :printAll();break;
			
		case 4 :
			
		case 5 :
			
		case 6 :
			
		case 7 :
			
		case 8 :
			
		case 9 :
			
			
		}
		
		}
		
	}
	public void addList() {
		System.out.println("***** 마지막 위치에 곡 추가 *****");
		System.out.print("곡 명 :");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("가수 명 :");
		String singer = sc.nextLine();
		System.out.println(mc.addList(new Music(title, singer)) == 1 ? "추가 성공" : "추가 실패");
		
		
	}
	public void addAtZero() {
		System.out.println("***** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("가수 명 :");
		String singer = sc.nextLine();
		System.out.println(mc.addAtZero(new Music(title, singer)) == 1 ? "추가 성공" : "추가 실패");
	}
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
		
	}
	public void searchMusic() {
		
	}
	public void removeMusic() {
		
	}
	public void setMusic() {
		
	}
	public void ascTitle() {
		
	}
	public void descSinger() {
		
	}
	
}
