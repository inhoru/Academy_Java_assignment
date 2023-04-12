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
			
		case 4 :searchMusic();break;
			
		case 5 :removeMusic();break;
			
		case 6 :setMusic();break;
			
		case 7 :ascTitle();break;
			
		case 8 :descSinger();break;
			
		case 9 :
			System.out.println("프로그램 종료");return;
			
			
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
		sc.nextLine();
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title)!=null?mc.searchMusic(title):"곡이없어");
		
	}
	public void removeMusic() {
		System.out.print("삭제할 곡 명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m!=null) {
			System.out.println(m.getSinger()+" - "+m.getTitle()+"을(를) 삭제 했습니다.");
		}else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 *******");
		System.out.print("검색할 곡 명 :");
		sc.nextLine();
		String searchTitle = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		Music set = new Music(title,singer);
		Music m = mc.searchMusic(searchTitle);
		System.out.println(mc.setMusic(searchTitle,set)!=null?
				m.getSinger()+" - "+m.getTitle()+" 값이 변경되었습니다.":"검색한 곡이 없어요");	
		
	}
	public void ascTitle() {
		if(mc.ascTitle()==1) {
			
			System.out.println("정렬 성공");
		}
			
	
		
		
		
	}
	public void descSinger() {
		if(mc.descSinger()==1) {
			
			System.out.println("정렬 성공");
		}
			
	}
	
}
