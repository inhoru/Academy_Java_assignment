package com.bs.hw.person.view;

import java.util.Scanner;

import com.bs.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount()[1] + "명입니다.");
			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		if (pc.personCount()[0] != 3) {
			while (true) {
				System.out.println("1. 학생추가");
				System.out.println("2. 학생보기");
				System.out.println("9. 메인으로");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					insertStudent();
					return;
				case 2:
					printStudent();
					return;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				}
			}
		} else if (pc.personCount()[0] == 3) {
			while (true) {
				System.out.println("1. 학생추가");
				System.out.println("2. 학생보기");
				System.out.println("9. 메인으로");
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
				System.out.print("메뉴 번호 : ");
				int num1 = sc.nextInt();
				switch (num1) {
				case 1:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");break;
				case 2:
					printStudent();
					return;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				}
			}

		}

	}

	public void employeeMenu() {

	}

	public void insertStudent() {
		
	}

	public void printStudent() {

	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}
}
