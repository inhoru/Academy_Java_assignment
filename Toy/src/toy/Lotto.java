package toy;
//
public class Lotto {

	public static void main(String[] args) {
		// 로또만들기!!
				// 1~45까지의 중복값없이 6자리로저장하기.
				int[] lotto = new int[6];

				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) {
							i--;
							break;
						}

					}

				}
				for (int i : lotto) {
					System.out.print(i + " ");
				}
				System.out.println();

	}

}
