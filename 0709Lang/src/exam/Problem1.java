package exam;

import java.util.Scanner;

//금액을 입력받아서 오만원, 만원 짜리를 몇 장 주어야 하는지 계산하는 프로그램을 작성

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int o = money / 50000;
		int m = money % 50000 / 10000;
		System.out.printf("오만원권 : %d장, 만원권 : %d장\n", o, m);

	}

}
