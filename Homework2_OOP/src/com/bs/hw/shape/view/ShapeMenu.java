package com.bs.hw.shape.view;

import java.util.Scanner;

import com.bs.hw.shape.controller.SquareController;
import com.bs.hw.shape.controller.TriangleController;
import com.bs.hw.shape.model.vo.Shape;

public class ShapeMenu {

	private Shape s = new Shape();
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	private Scanner sc = new Scanner(System.in);

	public void inputMenu() {
		boolean falg = true;
		while (falg) {

			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			if (num == 3) {
				triangleMenu();
			} else if (num == 4) {
				squareMenu();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				falg = true;

			}
		}

	}

	public void triangleMenu() {
		boolean falg = true;
		while (falg) {
			System.out.println("===== 삼격형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				inputSize(3, 1);
				break;
			case 2:
				inputSize(3, 2);
				break;

			case 3:
				printlnformation(3);
				break;

			case 9:
				// 이게왜 메인뷰로 돌아가지?
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			falg = true;	
			}

		}

	}

	public void squareMenu() {
		boolean falg = true;
		while (falg) {
			System.out.println("===== 사각형 =====");

			System.out.println("1. 사각형 둘레");
			System.out.println("2. 삼각형 면적");
			System.out.println("3. 삼각형 색칠");
			System.out.println("4. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				inputSize(4, 1);
				break;
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printlnformation(4);
				break;

			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			falg = true;		
			}

		}

	}

	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1) {
			System.out.println("높이 : ");
			int height = sc.nextInt();
			System.out.println("너비 : ");
			int width = sc.nextInt();
			System.out.println("삼각형 면적 : " + tc.calcArea(height, width));

		} else if (type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			sc.nextLine();
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");

		} else if (type == 4 && menuNum == 1) {
			System.out.println("높이 : ");
			int height = sc.nextInt();
			System.out.println("너비 : ");
			int width = sc.nextInt();
			System.out.println("사각형의 둘레 : " + scr.calcPerimeter(height, width));
		} else if (type == 4 && menuNum == 2) {
			System.out.println("높이 : ");
			int height = sc.nextInt();
			System.out.println("너비 : ");
			int width = sc.nextInt();
			System.out.println("사각형의 면적 : " + scr.calArea(height, width));
		} else if (type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			sc.nextLine();
			String color = sc.nextLine();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}

	}

	public void printlnformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}
	}

}
