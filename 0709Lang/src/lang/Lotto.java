package lang;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		// 1-45까지 중복되지 않는 6개의 정수 저장
		// 데이터를 저장할 배열 생성
		int[] lotto = new int[6];
		int size = lotto.length;
		int i, j;

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println(i+1+"번째 1~45 사이의 정수 입력 : ");
				String temp = sc.nextLine();

				lotto[i] = Integer.parseInt(temp);

				// lotto[i]<1 || lotto[i]>45
				if (!(lotto[i] >= 1 && lotto[i] <= 45)) {
					System.out.println("*Alarm* 1~45 사이에 있는 정수를 입력해주세요 : ");
					i = i - 1;
					continue;
				}

				// 이전에 입력된 값들과 비교 - 중복검사
				for (j = 0; j <= i - 1; j = j + 1) {
					// 이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if (lotto[i] == lotto[j]) {
						break;
					}
				}
				// 이전 데이터와 방금 입력된 데이터가 동일하면
				if (j != i) {
					System.out.println("*Alarm* 동일한 데이터는 안됩니다.");
					i = i - 1;
					continue;
				}

			} catch (Exception e) {
				System.out.println("*Alarm* 정수를 입력하세요");
				i = i - 1;
			}

		}
		sc.close();

		// 배열의 모든 데이터 출력
		for (i = 0; i < size; i = i + 1) {
			System.out.println(lotto[i]);
		}
	}
}
