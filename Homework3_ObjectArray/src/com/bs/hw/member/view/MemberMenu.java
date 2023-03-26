package com.bs.hw.member.view;

import java.util.Scanner;

import com.bs.hw.member.controller.MemberController;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {
		while (true) {
			if (mc.existMemberNum() < 10) {

				System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
				System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				switch (num) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

				}
			} else {
				System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
				System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int num = sc.nextInt();
				switch (num) {

				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}

		}
	}

	public void insertMember() {
		String id = "";
		char gender = ' ';
		System.out.println("새 회원을 등록합니다.");
		sc.nextLine();
		while (true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if (mc.checkId(id)) {
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}

		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		boolean falg = true;
		while (falg) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			if ((gender == 'm' || gender == 'M') || (gender == 'F' || gender == 'f')) {
				falg = false;
			} else {
				System.out.println("성별을 다시 입력하세요.");
				falg = true;
			}

		}
		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);

	}

	public void searchMember() {
		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				searchId();
				return;
			case 2:
				searchName();
				return;
			case 3:
				searchEmail();
				return;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}
		}
	}

	public void searchId() {
		sc.nextLine();
		System.out.println("검색할 아이디 : ");
		String id = sc.nextLine();
		System.out.println("찾으신 회원 조회 결과입니다.");
		System.out.println(mc.searchId(id));

	}

	public void searchName() {
		sc.nextLine();
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		System.out.println("찾으신 회원 조회 결과입니다.");
		if (mc.searchName(name).length == 0) {
			System.out.println("일치하는 회원이 없습니다.");

		} else
			for (int i = 0; i < mc.searchName(name).length; i++) {
				System.out.println(mc.searchName(name)[i].inform());
			}

	}

	public void searchEmail() {
		sc.nextLine();
		System.out.println("검색할 이메일 : ");
		String email = sc.nextLine();
		System.out.println("찾으신 회원 조회 결과입니다.");
		if (mc.searchName(email).length == 0) {
			System.out.println("일치하는 회원이 없습니다.");

		} else
			for (int i = 0; i < mc.searchName(email).length; i++) {
				System.out.println(mc.searchName(email)[i].inform());
			}

	}

	public void updateMember() {
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				updatePassword();
				return;
			case 2:
				updateName();
				return;
			case 3:
				undateEmail();
				return;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;

			}
		}
	}

	public void updatePassword() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();
		System.out.println(mc.updatePassword(id, password) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다.");

	}

	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		System.out.println(mc.updateName(id, name) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다.");

	}

	public void undateEmail() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 이메일 : ");
		String email = sc.nextLine();
		System.out.println(mc.updateEmail(id, email) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다.");

	}

	public void deleteMember() {
		while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				deleteOne();
				return;
			case 2:
				deleteAll();
				return;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void deleteOne() {
		sc.nextLine();
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("정말로 삭제하시겠습니까?(Y/N)");
		char ch1 = sc.next().charAt(0);
		if (ch1 == 'N' || ch1 == 'n') {
			return;
		} else if (ch1 == 'y' || ch1 == 'Y') {
			System.out.println(mc.delete(id) ? "성공적으로 삭제했습니다." : "없는 아이디입니다.");
			return;
		}
	}

	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까(y/n)");
		char ch1 = sc.next().charAt(0);
		if (ch1 == 'N' || ch1 == 'n') {
			return;
		} else if (ch1 == 'y' || ch1 == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");

		}
	}

	public void printAll() {

		for (int i = 0; i < mc.printAll().length; i++) {
			if (mc.printAll()[i] != null) {
				System.out.println(mc.printAll()[i].inform());

			}
		}
		if (mc.printAll().length == 0) {
			System.out.println("저장된 회원이 없습니다.");
		}

	}

}
