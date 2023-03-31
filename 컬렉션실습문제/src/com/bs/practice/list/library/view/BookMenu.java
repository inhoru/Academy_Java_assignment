package com.bs.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bs.practice.list.library.controller.BookController;
import com.bs.practice.list.library.model.vo.Book;

public class BookMenu {
	private BookController bc = new BookController();
	private Scanner sc = new Scanner(System.in);

	public BookMenu() {
	}

	public void mainMenu() {
		System.out.println("== Welcome BS Library ==");
		while (true) {
			System.out.println("******* 메인메뉴 ******");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다.다시 입력해주세요.");
				break;
			}

		}

	}

	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르( 1.인문 / 2. 자연과학/ 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		String categoryName = "";
		if (category == 1) {
			categoryName = "인문";
		} else if (category == 2) {
			categoryName = "자연과학";
		} else if (category == 3) {
			categoryName = "외국어";
		} else if (category == 4) {
			categoryName = "기타";
		}
		System.out.print("가격 : ");
		int price = sc.nextInt();
		bc.insertBook(new Book(title, author, categoryName, price));

	}

	public void selectList() {
		ArrayList<Book> bookList = bc.selectList();
		if (bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			System.out.println("===== 도서 전체 조회 =====");
			bookList.forEach((e) -> System.out.println("\t("+e.getTitle()+"/"+e.getAuthor()+"/"+e.getCategory()+"/"+e.getPrice()+")"));
			System.out.println();
		}

	}

	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.print("검색 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		ArrayList<Book> searchList = bc.searchBook(keyword);
		if(searchList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			searchList.forEach((e) -> System.out.println("\t("+e.getTitle()+"/"+e.getAuthor()+"/"+e.getCategory()+"/"+e.getPrice()+")"));
			System.out.println();
		}
		
					

	}

	public void deleteBook() {
		System.out.println("===== 도서 삭제 =====");
		System.out.print("삭제할 도서 명 : ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.print("삭제할 저자 명 : ");
		String author = sc.nextLine();
		Book remove =bc.deleteBook(title, author);
		if(remove!=null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else if (remove==null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			
		}
		
		
	}

	public void ascBook() {
		int num=bc.ascBook();
		if(num >0) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
