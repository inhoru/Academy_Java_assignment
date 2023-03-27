package toy;

import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
//
		/*
		 * 램덤으로 세개의 수를 각 자리 수에 저장 -> 정답값 사용자가 임의의 수 3개를입력받음 정답값이랑 비교하여 사용자가 입력한 숫자가 정답과
		 * 자리수와 숫자가 일치하면 -> 스트라이크, 사용자가 입력한 숫자가 정답과일치하고 자리수가 맞지 않으면 -> 볼, 사용자가 입력한 숫자가
		 * 일치한게 하나도 없으면 -> 파울으로 처리 정답을 맞출때까지 입력이 반복되야함.
		 */

		Scanner sc = new Scanner(System.in);
		int[] random = new int[3];
		int[] user = new int[3];
		boolean flag = true;
		char ch = ' ';

		System.out.println("==== 야구게임 시작 ====");
		// 1. 랜덤한 3개의 수 저장
		// 1-1 중복값제거
		for (int i = 0; i < random.length; i++) {
			int num = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (random[j] == num) {
					num = (int) (Math.random() * 9) + 1;
					j = -1;
				}
			}
			random[i] = num;
		}

		while (flag) {
			// 1-1. 사용자가 입력한 세 개의 수 입력
			for (int j = 0; j < user.length; j++) {
				System.out.println(j + 1 + "숫자 입력: ");
				user[j] = sc.nextInt();
			}
			// 2. 스트라이크와 볼 계산
			int strike = 0;
			int ball = 0;
			for (int j = 0; j < user.length; j++) {
				for (int r = 0; r < random.length; r++) {
					if (user[j] == random[r]) {
						if (j == r) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == 0 && ball == 0) {
				System.out.println("파울");
			} else {
				System.out.println(strike + " 스트라이크 " + ball + " 볼");
			}
			// 정답 출력 및 게임속행?
			if (strike == 3) {
				
				System.out.println("정답: " + random[0] + " " + random[1] + " " + random[2]);
				System.out.println("더하시겠습니까?(Y/N)");
				ch = sc.next().charAt(0);
				if(ch=='N') {
					System.out.println("게임 종료");
					flag = false;
					
				}else {
					//속행시 램덤값 다시 정함
					flag = true;
					for (int i = 0; i < random.length; i++) {
						int num = (int) (Math.random() * 9) + 1;
						for (int j = 0; j < i; j++) {
							if (random[j] == num) {
								num = (int) (Math.random() * 9) + 1;
								j = -1;
							}
						}
						random[i] = num;
					}
				}
				
				
			}
		}
	}
}