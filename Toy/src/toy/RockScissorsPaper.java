package toy;
//
import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rad = 0;
		int su;
		char choice = ' ';
		int win = 0;
		int lose = 0;
		int draw = 0;
		do {
			System.out.println("===가위바위보게임===");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("숫자를 입력하세요 : ");
			su = sc.nextInt();
			Random r = new Random();
			rad = 0;
			rad = r.nextInt(3) + 1;
			switch (su) {
			case 1:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (2 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					choice = ' ';
				} else if (3 == rad) {
					System.out.println("사용자가 이겼습니다.");
					win++;
					choice = ' ';
				}
				break;

			case 2:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (1 == rad) {
					System.out.println("사용자가 이겼습니다.");
					win++;
					choice = ' ';
				} else if (3 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					lose++;
					choice = ' ';
					
				}
				break;

			case 3:
				if (su == rad) {
					System.out.println("비겼습니다.");
					draw++;
				} else if (1 == rad) {
					System.out.println("컴퓨터가 이겼습니다.");
					win++;
					choice = ' ';
				} else if (2 == rad) {
					System.out.println("사용자가 이겼습니다.");
					lose++;
					choice = ' ';
				}
				break;

			}
			while (choice != 'N' && choice != 'Y') {
				System.out.println("다시 하시겠습니까?(Y/N)");
				choice = sc.next().charAt(0);
				if (choice != 'N' && choice != 'Y')
					System.out.println("입력값은 Y,N만 가능합니다.!");
			}
		} while (su == rad || (choice == 'Y'));

		System.out.println("프로그램을 종료하겠습니다!\n전적은 : " + win + "승 " + lose + "패 "
				+ draw + "무 입니다.");
	}
	

}
